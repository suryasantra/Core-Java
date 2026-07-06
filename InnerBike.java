import java.util.Scanner;

class Bike {
    {
        System.out.println("Hello Your Bike is here!!!!");
    }
    String name;
    double price;
    String brand="kTM";
    
    double engine_cc;
    Bike(){System.out.println("Bike Created");
        
    }
    Bike(String name){
        this();
        this.name = name;
    }
    Bike(double engine_cc){
        this.engine_cc=engine_cc;
    }
    Bike(String name,double price){
        this(name);
        this.price=price;
    }
    Bike(String name,double price,double engine_cc){
        // this(name);
        this(name,price);
        this.engine_cc=engine_cc;
    }
    Bike(String name,double price,String brand,double engine_cc){
        // this(name);
        // this(name,price);
        
        this(name,price);
        this.engine_cc=engine_cc;
    }
    // Bike(){}
     public void disp() {
        System.out.println("Model: "+name+" Engine_CC: "+engine_cc+" Price: "+price+" Brand:"+brand);
    }
    

}
public class InnerBike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike b =new Bike("Duke 200",225469,"KTM",199.95);
        Bike b1 =new Bike("Duke 200",225469,199.95);
        // Bike b2 =new Bike("Duke 200",225469,199.95);
        // Bike b3 =new Bike("Duke 200",225469,199.95);
        b1.brand="Bajaj";
        // b1.disp();
        b.disp();
        b1.disp();
    }
    
}
