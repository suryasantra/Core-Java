import java.util.Scanner;
import java.lang.Math;

public class IntSquare {

    public static void squareOfInt(int number1){
        double square=Math.pow(number1, 2); //Why I can not use int as datatype
        System.out.println("Square of "+number1+  " is: "+square);
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num1=take.nextInt();
        // System.out.println();
        
        squareOfInt(num1);

    }
}