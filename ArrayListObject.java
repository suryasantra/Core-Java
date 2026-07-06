import java.util.ArrayList;

class ArrayListObject{
    public static void main(String[] args) {
        ArrayList <Bike> a = new ArrayList();
        a.add(new Bike(200,"KTM"));
        a.add(new Bike(200,"KTM"));
        a.add(new Bike(200,"KTM"));
       System.out.println(a);
    }

}

class Bike{
    int price;
    String brand;
    Bike(int price, String brand){
        this.brand=brand;
        this.price=price;
    }
    public String toString(){
        return "["+brand+","+ price+"]";
    }
}