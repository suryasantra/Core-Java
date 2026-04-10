import java.util.Scanner;

public class CheckingVowelorConsonent {

    public static void main(String[] args) {
        System.out.print("Enter a letter or character: ");
        Scanner sc=new Scanner(System.in);
        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a Vowel");
                break;
        
            default:
                 System.out.println("It is a Consonant");
                break;
        }
    }
}