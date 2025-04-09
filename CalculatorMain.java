/*
 * Name: Pankaj Yadav
 * PRN: [23070126166]
 * Batch: [23-27]
 */

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("---- Calculator Application ----");
            System.out.println("Choose operation: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Square \n6. Cube \n7. Square Root");
            int choice = sc.nextInt();

            double a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Addition.add(a, b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Subtraction.subtract(a, b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Multiplication.multiply(a, b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Division.divide(a, b));
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Square.square(a));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Cube.cube(a));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + SquareRoot.sqrt(a));
                    break;

                default:
                    System.out.println("Invalid Choice!");
} 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
} 