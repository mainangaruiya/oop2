//package methodspkg;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length, width, area, perimeter;

        System.out.println("Enter the length:");
        length = input.nextFloat();

        System.out.println("Enter the width:");
        width = input.nextInt();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);

        input.close();
    }
}
