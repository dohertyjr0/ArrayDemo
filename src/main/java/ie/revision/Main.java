package ie.revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);

        System.out.println("Initial ArrayList values:");
        printArrayList(arrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new value to add to the ArrayList: ");
        int newValue = scanner.nextInt();

        arrayList.add(newValue);

        System.out.println("\nArrayList values after adding the new value:");
        printArrayList(arrayList);
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        int index = 0;
        for (int element : arrayList) {
            System.out.println("Element at index " + index + ": " + element);
            index++;
        }
    }
}
