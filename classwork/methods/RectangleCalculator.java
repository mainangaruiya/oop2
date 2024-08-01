import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        RectangleCalculator rectobj1 = new RectangleCalculator();
        rectobj1.computeAreaPerimeter();
    }

    public void computeAreaPerimeter() {
        double[] dimensions = inputDimensions();
        double length = dimensions[0];
        double width = dimensions[1];

        double[] results = calculateAreaPerimeter(length, width);
        double area = results[0];
        double perimeter = results[1];

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("You hacked NASA mainframe");
    }

    public double[] inputDimensions() {
        Scanner input = new Scanner(System.in);
        double[] dimensions = new double[2];
        
        System.out.println("Enter the length:");
        dimensions[0] = input.nextDouble();
        
        System.out.println("Enter the width:");
        dimensions[1] = input.nextDouble();
        
        return dimensions;
    }

    public double[] calculateAreaPerimeter(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        return new double[] { area, perimeter };
    }
}


/*import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        RectangleCalculator rectobj1 = new RectangleCalculator();
        rectobj1.computeAreaPerimeter();
    }

    public void computeAreaPerimeter() {
        double[] dimensions = inputDimensions();
        double length = dimensions[0];
        double width = dimensions[1];
        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("You hacked NASA mainframe");
    }

    public double[] inputDimensions() {
        Scanner input = new Scanner(System.in);
        double[] dimensions = new double[2];
        
        System.out.println("Enter the length:");
        dimensions[0] = input.nextDouble();
        
        System.out.println("Enter the width:");
        dimensions[1] = input.nextDouble();
        
        return dimensions;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
*/