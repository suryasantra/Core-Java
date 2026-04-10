import java.util.Scanner;
public class EvenOddUsingSwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        switch (num1%2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        
            default:
                break;
        }
    }
    
}