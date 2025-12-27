import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // 1️⃣ Normal binary search logic
        int left = 0;
        int right = n - 1;
        int position = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Normal logic: Element " + key + " found at index " + position);
        } else {
            System.out.println("Normal logic: Element " + key + " not found");
        }

        // 2️⃣ Using built-in Arrays.binarySearch() function
        int builtInPos = Arrays.binarySearch(arr, key);
        if (builtInPos >= 0) {
            System.out.println("Built-in function: Element " + key + " found at index " + builtInPos);
        } else {
            System.out.println("Built-in function: Element " + key + " not found");
        }

        sc.close();
    }
}
