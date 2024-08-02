import java.util.Scanner;

public class Rect {

    public static void getDimensions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = scan.nextDouble();

        System.out.println("Enter the width of rectangle: ");
        double width = scan.nextDouble();
        
        computeAreaPerimeter(length, width);
        scan.close();
    }

    public static void computeAreaPerimeter(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        displayValues(area, perimeter);
    }

    public static void displayValues(double area, double perimeter) {
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        getDimensions();
    }
}
