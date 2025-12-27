import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Method 1: Using Arrays.equals() with if-else
        boolean isEqual1 = Arrays.equals(arr1, arr2);
        if (isEqual1) {
            System.out.println("\nUsing Arrays.equals(): Arrays are equal");
        } else {
            System.out.println("\nUsing Arrays.equals(): Arrays are not equal");
        }

        // Method 2: Using normal logic with if-else
        boolean isEqual2 = true;
        if (arr1.length != arr2.length) {
            isEqual2 = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual2 = false;
                    break;
                }
            }
        }

        if (isEqual2) {
            System.out.println("Using normal logic: Arrays are equal");
        } else {
            System.out.println("Using normal logic: Arrays are not equal");
        }

        sc.close();
    }
}
