import java.util.Scanner;

public class CheckPosNegUsingReturn {
    public static String checkANum(double number1){
        

        if(number1<0)
            return "negative number";
        
        else if(number1>0)
            return "Positive number";
        
        else
            return "zero.";
        
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        double num1=take.nextDouble();
        // System.out.println();
        
        System.out.println(+num1+" is a "+checkANum(num1));

    }
}
