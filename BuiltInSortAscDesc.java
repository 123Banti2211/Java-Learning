import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BuiltInSortAscDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1️⃣ Sort in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2️⃣ Sort in descending order
        // Convert int[] to Integer[] because Collections.reverseOrder() works with objects
        Integer[] arrDesc = new Integer[n];
        for (int i = 0; i < n; i++) {
            arrDesc[i] = arr[i];
        }

        Arrays.sort(arrDesc, Collections.reverseOrder());
        System.out.println("\nSorted array in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arrDesc[i] + " ");
        }

        sc.close();
    }
}
