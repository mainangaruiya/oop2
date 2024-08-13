import java.util.Scanner;

public class Square {
    static float squareArea, squareWidth, squareLength;
    public static void main(String[] args) {
        Get_input();      // Get input from the user
        calc_area();      // Calculate the area
        outputArea();     // Output the area
    }
    static public void Get_input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        squareLength = sc.nextFloat();
        System.out.print("Enter width: ");
        squareWidth = sc.nextFloat();
    }
    static void calc_area() {
        squareArea = squareWidth * squareLength;
    }
    static void outputArea() {
        System.out.println("The square area is " + squareArea);
    }
}
