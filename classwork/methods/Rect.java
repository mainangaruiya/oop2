import java.util.Scanner;

public class Rect {
    Scanner scan = new Scanner(System.in);

    private double length;
    private double width;
    private double area;
    private double perimeter;

    public void getDimensions() {
        System.out.println("Enter the length of rectangle: ");
        length = scan.nextDouble();

        System.out.println("Enter the width of rectangle: ");
        width = scan.nextDouble();
    }

    public void computeAreaPerimeter() {
        area = length * width;
        perimeter = 2 * (length + width);
    }

    public void displayValues() {
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        Rect rectobj1 = new Rect();
        rectobj1.getDimensions();
        rectobj1.computeAreaPerimeter();
        rectobj1.displayValues();
    }
}
