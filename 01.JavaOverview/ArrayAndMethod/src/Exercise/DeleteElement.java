package Exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int index = -1;
        int arr[] = {12,3,12,43,5,89,0,0,0,0};
        System.out.printf("nhap gia tri can xoa : ");
        int x = scanner.nextInt();
        for (i = 0; i < arr.length; i ++) {
            if(arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for(i = index; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("New array : ");
            for(i = 0; i < arr.length; i++) {
                System.out.printf(arr[i] + " ");
            }
        } else {
            System.out.printf("Khong co gia tri %d trong mang !!", x);
        }

    }

}
