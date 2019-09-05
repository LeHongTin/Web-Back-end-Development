package Exercise;

import java.util.Scanner;

public class PoolingArrayt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int arr1[] = new int[10];
        int arr2[] = new int[8];
        int n = arr1.length + arr2.length;
        int arr3[] = new int [n];
        System.out.println("Enter array 1 : ");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter Array 2 : ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (i = 0; i < n ; i++) {
            if(i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("Pooling Array 1 and 2 is : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
