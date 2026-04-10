import java.util.Scanner;

public class MultiplicationOfTwoInt {
    public static void multiplicationOfInt(int num1, int num2){
        int multi = num1 * num2;
        System.out.println("Multiplication of "+num1+ " and " +num2+ " is: "+multi);
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=take.nextInt();
        // System.out.println();
        System.out.print("Enter Second Number: ");
        int num2=take.nextInt();
        multiplicationOfInt(num1,num2);

    }
}
