import java.util.Scanner;

public class AreaOfRectangleUsingReturn {

    public static double areaOfRectangleOne(double length, double width){
        double area = length * width;
        return area;
    }
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle: ");
        double length=take.nextDouble();
        // System.out.println();
        System.out.print("Enter width of the Rectangle: ");
        double width=take.nextDouble();
        System.out.println("Area of this Rectangle is: "+areaOfRectangleOne(length, width));

    }

    
}


