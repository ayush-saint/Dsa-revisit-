//find the average of all elements of array 

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        Double average = (double) sum / n;

        System.out.println("the average is : " + average);

        sc.close();

    }
}