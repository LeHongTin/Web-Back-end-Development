package Exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int newarr[] = new int[arr.length + 1];
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
        for (i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (i = index; i <= arr.length; i++) {
            newarr[n] = arr[n-1];
            n--;
        }
        newarr[index] = value;
        System.out.printf("New Array is : ");
        for(i = 0; i < newarr.length; i++) {
            System.out.printf("%d",newarr[i]);
            System.out.printf(" ");
        }
    }
}
