package Practices;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number! ");
        int number = scanner.nextInt();


        if (number < 2) {
            System.out.println("is not a prime");
        } else {
            int i;
            boolean check = true;

            for (i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    check = false;
                    break;
                }
            }

            if(check==true) {
                System.out.println(number + " is a Prime !");
            } else {
                System.out.println(number + " is not a Prime !");
            }
        }
    }
}