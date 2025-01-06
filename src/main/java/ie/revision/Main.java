package ie.revision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] Array = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new value for index 10: ");
        int newValue = scanner.nextInt();

        try {
            Array[10] = newValue;
            System.out.println("Value at index 10: " + Array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index 10 is out of bounds for this array.");
        }

        public static void printArray(int[] array) {
            int index = 0;
            for (int element : array) {
                System.out.println("Element at index " + index + ": " + element);
                index++;
            }
        }
    }
}