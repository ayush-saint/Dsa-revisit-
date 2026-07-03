// replace all the occurrences of a specific element with another number 

import java.util.Scanner;

public class arrayQ7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element you want to replace: ");
        int target = sc.nextInt();

        System.out.println("enter the number to replace ");
        int replace = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                arr[i] = replace;
            }
        }

        System.out.println("the updated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}