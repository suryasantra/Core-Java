import java.util.Scanner;

class Cab{

}
class Mini extends Cab{

}
class Suv extends Cab{

}
class Luxury extends Cab{

}

class Genaralization {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for Mini 2 for Suv 3 for Luxury");
        int ch = sc.nextInt();
        Cab c = null;
        switch (ch) {
            case 1:c = new Mini();                
                break;
            case 2:c = new Suv();                
                break;
            case 3:c = new Luxury();                
                break;
        
            default: System.out.println("Invalid Choice");
                break;
        } 
        System.out.println(c);
        // return 0;
        System.out.println(args[0]);
    }
}
