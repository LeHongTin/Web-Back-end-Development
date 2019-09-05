package Exercise;

import java.util.Scanner;

public class ReadingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        String read = null;
        int tens;
        int ones;
        if (0 <= number && number<=10) {
            switch (number) {
                case 0:
                    read = "Zero";
                    break;
                case 1:
                    read = "One";
                    break;
                case 2:
                    read = "Two";
                    break;
                case 3:
                    read = "Three";
                    break;
                case 4:
                    read = "Four";
                    break;
                case 5:
                    read = "Five";
                    break;
                case 6:
                    read = "Six";
                    break;
                case 7:
                    read = "Seven";
                    break;
                case 8:
                    read = "Eight";
                    break;
                case 9:
                    read = "Night";
                    break;
                case 10:
                    read = "Ten";
                    break;
            }
            System.out.println("Reading Number : " + read);

        }
        if(number < 20 && number >10 ) {
            ones = (number % 10);
            switch (ones) {
                case 1:
                    read = "Eleven";
                    break;
                case 2:
                    read = "twelve";
                    break;
                case 3:
                    read = "Thirteen";
                    break;
                case 4:
                    read = "Fourteen";
                    break;
                case 5:
                    read = "Fifteen";
                    break;
                case 6:
                    read = "Sixteen";
                    break;
                case 7:
                    read = "Seventeen";
                    break;
                case 8:
                    read = "Eighteen";
                    break;
                case 9:
                    read = "Nighteen";
                    break;
            }
            System.out.println("Reading Number : " + read);
        }
        if(number >=20 && number <100) {
            String readOnes = "", readTens = "";


            ones = number % 10;
            tens = number / 10;
            switch (ones) {
                case 0:
                    readOnes = "";
                    break;
                case 1:
                    readOnes = "One";
                    break;
                case 2:
                    readOnes = "Two";
                    break;
                case 3:
                    readOnes = "Three";
                    break;
                case 4:
                    readOnes = "Four";
                    break;
                case 5:
                    readOnes = "Five";
                    break;
                case 6:
                    readOnes = "Six";
                    break;
                case 7:
                    readOnes = "Seven";
                    break;
                case 8:
                    readOnes = "Eight";
                    break;
                case 9:
                    readOnes = "Nine";
                    break;
            }
            switch (tens) {
                case 2:
                    readTens = "Twenty";
                    break;
                case 3:
                    readTens = "Thirty";
                    break;
                case 4:
                    readTens = "Forty";
                    break;
                case 5:
                    readTens = "Fifty";
                    break;
                case 6:
                    readTens = "Sixty";
                    break;
                case 7:
                    readTens = "Seventy";
                    break;
                case 8:
                    readTens = "Eighty";
                    break;
                case 9:
                    readTens = "Ninety";
                    break;
            }
            System.out.println("Reading Number : " + readTens + " " +readOnes);
        }

    }
}
