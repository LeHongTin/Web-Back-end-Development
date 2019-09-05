package Exercise;


import java.util.Scanner;

public class AppCurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int RATE = 23000;
        float vnd;
        float usd;
        System.out.println("Currency Conversion Application");
        System.out.println("1. VND to USD");
        System.out.println("2. USD to VND");
        System.out.println("0. Exit");
        System.out.print("Enter your choice ");
        int choice = input.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.printf("Enter your currenccy VND ");
                    vnd = input.nextFloat();
                    usd = vnd / RATE;
                    System.out.printf("Change to USD : %.1f", usd);
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("Enter your currenccy USD ");
                    usd = input.nextFloat();
                    vnd = usd * RATE;
                    System.out.printf("Change to VND : %.1f", vnd);
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("Enter again your choice");
            choice = input.nextInt();
        }
    }
}