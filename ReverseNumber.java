public class ReverseNumber {
    public static void main(String[] args) {
        int newNum=12321;
        int num = newNum;
        int rev=0;
        while (num!=0) {

            int rim= num%10;
            rev= rev*10+rim;
            num/=10;

        }
        if (newNum==rev) {
           System.out.println("It is Palindrome"); 
        }
        else
            System.out.println("Not Palindrome");
        
        
        

    }
}
