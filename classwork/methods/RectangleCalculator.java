import java.util.Scanner;
public class RectangleCalculator {
    public static void main(String[] args) {
        RectangleCalculator rectobj1 = new RectangleCalculator();
        rectobj1.computeAreaPerimeter();
    }
    public void computeAreaPerimeter(){
    //local variables
    double length,width,area,perimeter;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length:");
    length = input.nextDouble();
    System.out.println("Enter the width:");
    width = input.nextDouble();
    area = length* width;
    perimeter = 2 * (length+width);

    System.out.println("Area is: " + area);
    System.out.println("Perimeter is: " + perimeter);
    System.out.println("You hacked nasa mainframe");
    

}

}//split to three methods
