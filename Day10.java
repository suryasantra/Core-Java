class Bike{
    String model;
    double engine_CC;
    double price;
    public void disp() {
        System.out.println("Model: "+model+" Engine_CC: "+engine_CC+" Price: "+price);
    }
}

public class Day10 {

    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b4=b1;
        Bike b2=new Bike();
        Bike b3=new Bike();
        b1.model="Ns 200";
        b1.engine_CC=200;
        b1.price=1555559.66;
        b2.model="Duke 200";
        b2.engine_CC=199.5;
        b2.price=210550.34;
        b3.model="Mt-15";
        b3.engine_CC=155;
        b3.price=185509.66;
        System.out.println(b1.model);
        System.out.println(b2.model);
        System.out.println(b3.model);
        // System.out.println(b1); //Error show

        b1.disp();
        b2.disp();
        b3.disp();
        System.out.println(b1==b4);

    }
}