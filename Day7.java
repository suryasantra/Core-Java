//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< METHOD OVERLOADING> >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;
class Day7{
    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static int add(int a, int b,int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        // System.out.println(add(5,8)); //It will show error because of void
        // add(5, 8);
        // System.out.println(add(5,8,3));

        // int result = add(5,8); //It will show the error for void
        // System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        add(num1,num2);
        System.out.println(add(num1,num2,num3));
        sc.close();
    }
}