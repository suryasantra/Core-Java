import java.util.Scanner;

public class LargestAmong {
    public static double check(double num1, double num2){
        if (num1>num2) {
            System.out.println(num1+"is greater than "+num2);
        }
        else if(num2>num1)
            System.out.println(num2+"is greater than "+num1);
        else
            System.out.println(num1+ " and "+num2+ " both are equal");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        check(num1, num2);
        sc.close();
    }

}
