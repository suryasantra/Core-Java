import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        System.out.print("Enter Student's Marks:");
        Scanner sc=new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90)
            System.out.println("A");
        else if(marks>=75)
            System.out.println("B");
        else if(marks>=65)
            System.out.println("C");
        else if(marks>=55)
            System.out.println("D");
        else
            System.out.println("Dubba Fellow");
    }
}
