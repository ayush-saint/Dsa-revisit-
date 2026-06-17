// linear search 

import java.util.Scanner;

public class arrayQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of arrays : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element , you want to search: ");

        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("index of target element is :  " + index);
        } else {
            System.out.println("element not found");
        }

        sc.close();
    }
}