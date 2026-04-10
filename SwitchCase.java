import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:System.out.println("First");
                break;
            case 2:System.out.println("Second");
                break;
        
            case 5:System.out.println("Fifth");
                break;
        
            default:
                System.out.println("Invalid");
        }
    }
}
