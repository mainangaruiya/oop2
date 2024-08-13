import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class myarray {
    public static void main(String[] args) {
        int[] javascores = new int[7];
        Scanner scanner = new Scanner(System.in);

        // Use a loop to input data into the array
        for (int i = 0; i < javascores.length; i++) {
            System.out.print("Enter score for index " + i + ": ");
            javascores[i] = scanner.nextInt();
        }

        // Access element in index 1
        System.out.println("Element at index 1: " + javascores[1]);

        // For loop to print elements
        System.out.println("Array elements:");
        for (int index = 0; index < javascores.length; index++) {
            System.out.println(javascores[index]);
        }

        // Sum all elements
        int sum = 0;
        for (int score : javascores) {
            sum += score;
        }
        System.out.println("Sum of all elements: " + sum);

        // Sort array in ascending order
        Arrays.sort(javascores);
        System.out.println("Array elements in ascending order:");
        for (int score : javascores) {
            System.out.println(score);
        }

        // Sort array in descending order
        Integer[] javascoresDescending = Arrays.stream(javascores).boxed().toArray(Integer[]::new);
        Arrays.sort(javascoresDescending, Collections.reverseOrder());
        System.out.println("Array elements in descending order:");
        for (int score : javascoresDescending) {
            System.out.println(score);
        }

        scanner.close();
    }
}
