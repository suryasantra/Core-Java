import java.util.ArrayList;

class InnerSearchingCustomObject {
    public static void main(String[] args) {
        ArrayList<Remote1> a= new ArrayList<>();
        a.add(new Remote1(350, "Sony"));
        a.add(new Remote1(250, "LG"));
        a.add(new Remote1(450, "Philips"));
        a.add(new Remote1(50, "local"));
        System.out.println(a.contains(new Remote1(50, "local")));
        System.out.println(a.indexOf(new Remote1(50, "local")));
        }
}
class Remote1{
    int price;
    String brand;
    Remote1(int price,String brand){
        this.price=price;
        this.brand=brand;
    }
    public String toString(){
        return "{price=" + price+ ",brand="+ brand+"}";
    }
  
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        Remote1 r = (Remote1)o;
      return this.price==r.price && this.brand.equals(r.brand)  ;
    }
}