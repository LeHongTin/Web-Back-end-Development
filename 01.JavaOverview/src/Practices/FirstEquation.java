package Practices;

import java.util.Scanner;

public class FirstEquation {
    public static void main(String[] args) {
        double a, b, x;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = scanner.nextDouble();
        System.out.println("Enter b : ");
        b = scanner.nextDouble();

        if (a != 0) {
            x = -b / a;
            System.out.println("The solution is : " + x);
        } else {
            if (b != 0) {
                System.out.println();
            }
        }
    }
}