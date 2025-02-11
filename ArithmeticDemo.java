// This program demonstrates arithmetic operations and operator precedence in Java.

public class ArithmeticDemo {
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int num1 = 10;
        int num2 = 5;

        // Declare and initialize a double variable
        double num3 = 3.0;

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Integer division (truncates decimals)
        int remainder = num1 % num2; // Modulus operation

        // Demonstrate operator precedence
        int expressionResult = num1 + num2 * 2 - (num1 / num2);
        // Calculation breakdown:
        // 1. num1 / num2 = 10 / 5 = 2
        // 2. num2 * 2 = 5 * 2 = 10
        // 3. num1 + 10 - 2 = 10 + 10 - 2 = 18

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Operator precedence
    }
}
