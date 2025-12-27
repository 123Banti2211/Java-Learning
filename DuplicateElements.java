import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElements{
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

        // 1️⃣ Using normal logic (nested loops) with flag
        System.out.println("\nDuplicate elements using normal logic with flag:");
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {
            boolean flag = false; // flag to check duplicate ahead
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true; // duplicate found
                }
            }
            if (flag) {
                // Check if already printed
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found");
        }

        // 2️⃣ Using HashSet with flag
        System.out.println("\n\nDuplicate elements using HashSet with flag:");
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < n; i++) {
            boolean flag = !set.add(arr[i]); // true if element already exists
            if (flag) {
                System.out.print(arr[i] + " ");
                hasDuplicate = true;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates found");
        }

        sc.close();
    }
}
