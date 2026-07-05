class Bike{
    String model;
    double engine_CC;
    double price;
    Bike(String m,double ecc,double p){
        model=m;
        engine_CC=ecc;
        price=p;
    }
    public void disp() {
        System.out.println("Model: "+model+" Engine_CC: "+engine_CC+" Price: "+price);
    }
}
public class Day10B {
    public static void main(String[] args) {
        Bike b1 = new Bike("Duke200", 200, 225000);
        b1.disp();
    }
}