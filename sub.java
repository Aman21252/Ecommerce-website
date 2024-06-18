import java.util.Scanner;

public class AdvancedSubtraction {
    
    // Method to perform subtraction
    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number (a): ");
            int a = scanner.nextInt();
            
            // Prompt the user to enter the second number
            System.out.print("Enter the second number (b): ");
            int b = scanner.nextInt();
            
            // Prompt the user to enter the third number
            System.out.print("Enter the third number (c): ");
            int c = scanner.nextInt();
            
            // Perform the subtraction using the method
            int result = subtract(a, b, c);
            
            // Display the result
            System.out.println("The result of " + a + " - " + b + " - " + c + " is: " + result);
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
