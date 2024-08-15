package MethodLevel;

import java.util.Scanner;

public class Cuboid {
    // Static variables to store the dimensions
    private static double length;
    private static double width;
    private static double height;

    // Static method to take input from the user
    public static void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
    }

    // Static method to calculate volume
    public static double calculateVolume() {
        return length * width * height;
    }

    // Static method to calculate surface area
    public static double calculateSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Static method to validate dimensions
    private static boolean validateDimensions() {
        return length > 0 && width > 0 && height > 0;
    }

    // Static method to display cuboid details
    public static void displayDetails() {
        if (validateDimensions()) {
            System.out.println("Cuboid Details:");
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Volume: " + calculateVolume());
            System.out.println("Surface Area: " + calculateSurfaceArea());
        } else {
            System.out.println("Invalid dimensions provided.");
        }
    }
}


