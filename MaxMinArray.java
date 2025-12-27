import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Find max and min using normal for loop
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);

        sc.close();
    }
}
