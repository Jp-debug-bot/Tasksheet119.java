import java.util.Scanner;

public class ArithmeticOperations {
    
    // Method to perform addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(int a, int b) {
        // Handle division by zero
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b; // Cast to double for floating-point division
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Perform and print the results of the operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // Close the scanner
        scanner.close();
    }
}
