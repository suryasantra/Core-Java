import java.util.Scanner;

public class CheckingPosNegUsingMethod {
    public static void checkANum(double number1){
        

        if(number1<0)
            System.out.println("The "+number1+  " is Negative.");
        
        else if(number1>0)
            System.out.println("The "+number1+  " is Positive.");
        
        else
            System.out.println("The "+number1+  " is zero.");
        
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        double num1=take.nextDouble();
        // System.out.println();
        
        checkANum(num1);

    }
}
