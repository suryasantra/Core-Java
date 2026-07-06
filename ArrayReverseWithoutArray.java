import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class ArrayReverseWithoutArray {
    public static void disp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            // System.out.println();
        }
    } 

    public static int[] arrayTake(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size:");
         int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        return arr;
    }
    public static void main(String[] args) {
       
        // int []arr={1,2,3,4};
       
        int[] arr=arrayTake();
        disp(arr);
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
        System.out.println("\n----------");
        disp(arr);
    }
}
