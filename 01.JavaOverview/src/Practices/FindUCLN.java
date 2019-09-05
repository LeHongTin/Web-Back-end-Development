package Practices;
import java.util.Scanner;

public class FindUCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find greatest common factor");

        System.out.println("Enter the first number :");
        int number1 = input.nextInt();

        System.out.println("Enter the second number");
        int number2 = input.nextInt(), number;

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        if(number1 ==0 || number2 ==0) {
            number = number1 + number2;
        } else {
            while (number1 * number2 != 0) {
                if (number1 > number2) {
                    number1 %= number2;
                } else {
                    number2 %= number1;
                }
            }
            number = number1 + number2;
            System.out.println("Greatest common factor is : " + number);
        }
    }
}
