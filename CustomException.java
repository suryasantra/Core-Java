 import java.util.Scanner;

 
 class VoteException extends RuntimeException {
    String message;
    VoteException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}


public class CustomException{
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Your Age:");
    int age =sc.nextInt();
    try {
        if (age<18) {
            throw new VoteException("Not Eligible");
        }
        else{
            System.out.println("Eligible");
        }
    } catch (VoteException e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }
   }
    
}
