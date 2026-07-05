import java.util.Comparator;

public class Remote implements Comparable<Remote> {
    int price;
    String brand;
    Remote(int price,String brand){
        this.price=price;
        this.brand=brand;
    }
    public String toString(){
        return "{price=" + price+ ",brand="+ brand+"}";
    }
  
    // public boolean equals(Object o) {
    //     // TODO Auto-generated method stub
    //     Remote1 r = (Remote1)o;
    //   return this.price==r.price && this.brand.equals(r.brand)  ;
    // }
    public int compareTo(Remote r){
        return this.price-r.price;
    }

}
class PriceComparator implements Comparator<Remote>{
    public int compare(Remote r1, Remote r2){
        return r1.price-r2.price;
    }
}
