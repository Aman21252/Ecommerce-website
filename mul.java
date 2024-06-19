import java.util.Scanner;

public class MultiplyFourNumbers {

    // Function to multiply four numbers
    public static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Prompt the user to enter the fourth number
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        // Call the multiply
