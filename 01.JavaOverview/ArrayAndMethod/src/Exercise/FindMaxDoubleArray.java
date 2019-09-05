package Exercise;

import java.util.Scanner;

public class FindMaxDoubleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int arr[][] = new int[5][5];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random()*100);
                }
            }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Max is : %d", max);
    }
}
