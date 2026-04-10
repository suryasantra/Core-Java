import java.util.Scanner;
public class EligibleVote {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = take.nextInt();
        check(age);
        take.close();
    }
    public static void check(int age) {
        if (age>=18)
        {
            System.out.println("You are Eligible for vote");
        }
        else
            System.out.println("You are Not Eligibile for Vote ");
    }
}
