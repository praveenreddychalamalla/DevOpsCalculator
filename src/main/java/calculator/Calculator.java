package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("DevOps - Calculator, Choose to perform operation");
            System.out.print("Press 1 to Add\nPress 2 to Subtract\nPress 3 to Multiply\nPress 4 to Divide\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                System.out.print("Enter the first number : ");
                number1 = scanner.nextDouble();
                System.out.print("Enter the second number : ");
                number2 = scanner.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println("Invalid input, Entered input is not a number");
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("Addition result is : " + calculator.add(number1, number2));
                    break;
                case 2:
                    System.out.println("Subtraction result is : " + calculator.subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Multiplication result is : " + calculator.multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("Division result is : " + calculator.divide(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double add(double number1, double number2) {
        System.out.println("Addition of " + number1 + ", " + number2);
        double result = number1 + number2;
        System.out.println("RESULT = " + result);
        return result;
    }

    public double subtract(double number1, double number2) {
        System.out.println("Subtraction of " + number1 + ", " + number2);
        double result = number1 - number2;
        System.out.println("RESULT = " + result);
        return result;
    }
    public double multiply(double number1, double number2) {
        System.out.println("Multiplication of " + number1 + ", " + number2);
        double result = number1 * number2;
        System.out.println("RESULT = " + result);
        return result;
    }

    public double divide(double number1, double number2) {
        System.out.println("Division of " + number1 + ", " + number2);
        double result = number1 / number2;
        System.out.println("RESULT = " + result);
        return result;
    }
}