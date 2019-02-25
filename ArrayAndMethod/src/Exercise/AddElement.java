package Exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        System.out.printf("Array is : ");

        for(i = 0; i < arr.length; i++) {
            System.out.printf("%d",arr[i]);
            System.out.printf(" ");
        }

        System.out.println("Enter index : ");
        int index = input.nextInt();
        System.out.println("Enter value : ");
        int value = input.nextInt();
        for (i = index; i <= arr.length; i++) {
            arr[n] = arr[n-1];
            n--;
        }
        arr[index] = value;
        System.out.printf("New Array is : ");
        for(i = 0; i < arr.length; i++) {
            System.out.printf("%d",arr[i]);
            System.out.printf(" ");
        }
    }
}
