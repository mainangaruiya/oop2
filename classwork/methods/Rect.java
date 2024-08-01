import java.util.Scanner;

public class Rect {
    Scanner scan = new Scanner(System.in);

   
    public void getDimensions() {
        System.out.println("Enter the length of rectangle: ");
        double length = scan.nextDouble();

        System.out.println("Enter the width of rectangle: ");
       double width = scan.nextDouble();
       computeAreaPerimeter(length, width);
    }

    public void computeAreaPerimeter(double length, double width) {
       double area = length * width;
       double perimeter = 2 * (length + width);
       displayValues(area, perimeter);

    }

    public void displayValues(double area, double perimeter) {
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        Rect rectobj1 = new Rect();
        rectobj1.getDimensions();
    }
}
