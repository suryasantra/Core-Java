// Using Method & User Taking Input

import java.util.Scanner;

class AreaOfRectangle{
    public static void areaOfRectangle(double length, double width){
        double area = length * width;
        System.out.println("Area of this Rectangle is: "+area);
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle: ");
        double length=take.nextDouble();
        // System.out.println();
        System.out.print("Enter width of the Rectangle: ");
        double width=take.nextDouble();
        areaOfRectangle(length, width);

    }
}