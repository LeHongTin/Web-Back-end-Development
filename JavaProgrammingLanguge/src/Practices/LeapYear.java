package Practices;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean check = false;
        if (year % 4 == 0) {
            check = true;
            if (year % 100 == 0 && year % 400 != 0) {
                check = false;
            }
        }
        if(check) {
            System.out.println("Year " + year + " is leap year");
        } else {
            System.out.println("Year " + year + " is not leap year");
        }
    }
}
