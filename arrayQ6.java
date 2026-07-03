// Given an array of integers arr of size N and an integer X, count how many times X appears in the array

import java.util.Scanner;

public class arrayQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element of occurance you want to count : ");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("the count of occurance of the given element is : " + count);

        sc.close();

    }
}
