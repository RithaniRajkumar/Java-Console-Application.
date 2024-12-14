import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public float subtract(int a, float b, char op) {
        if (op == '-') {
            return a - b;
        }
        return 0;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public float calculate(int a, float b, String operation) {
        if (operation.equals("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Division by zero.");
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        System.out.println("Result: " + result);
    }
}
