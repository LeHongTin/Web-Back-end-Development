package Exercise;

import javax.tools.FileObject;
import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner input = new Scanner(System.in);
        System.out.println("   Menu    ");
        System.out.println("1. Print the retangle ");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    for (i = 1; i <= 4; i++){
                        System.out.println("* * * * * * *");
                    }
                    break;
                case 2:
                    for (i = 1; i<=6; i++) {
                        for (j = 6; j >= i ; j-- ) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (i = 1; i<=6; i++) {
                        for (j = i; j > 0 ; j-- ) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Enter again your choice: ");
            choice = input.nextInt();
        }
    }
}
