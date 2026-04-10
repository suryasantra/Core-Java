import java.util.Scanner;

public class IntSquareUsingReturn {
    public static double squareOfInt(int number1){
        double square=Math.pow(number1, 2); //Why I can not use int as datatype
        return square;
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num1=take.nextInt();
        // System.out.println();
        System.out.println("Square of "+num1+  " is: "+squareOfInt(num1));

    }
}
