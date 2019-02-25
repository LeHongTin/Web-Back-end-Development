package Exercise;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number : ");
        int num = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            if(isPrime(n)) {
                System.out.println(n);
                count ++;
            } n++;
        }

    }
    public static boolean isPrime(int n) {
        boolean result = true;
        if (n != 2) {
            for (int i = 2; i < n; i++) {
                if(n % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}
