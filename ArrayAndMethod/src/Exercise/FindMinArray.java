package Exercise;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.printf("Enter side of array : ");
        int SIDE = scanner.nextInt();
        int arr[] = new int[SIDE];
        System.out.println("Enter element of array : ");
        for (i = 0; i< arr.length; i ++ ) {
            System.out.printf("Element[%d] : ", i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (i = 1; i< arr.length; i ++ ) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Min is : %d", min);

    }
}
