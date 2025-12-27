import java.util.Scanner;

public class LinearSearch {
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

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Linear search using normal for loop
        boolean found = false;
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                position = i; // index where element is found
                break; // stop at first occurrence
            }
        }

        // Output result
        if (found) {
            System.out.println("Element " + key + " found at index " + position);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }

        sc.close();
    }
}
