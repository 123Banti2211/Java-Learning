import java.util.Scanner;
public class MissingNumerInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size (n-1 elements)
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // this is the size of the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers from 1 to " + (n + 1) + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum formula method using normal for loop
        int total = (n + 1) * (n + 2) / 2; // sum of numbers from 1 to n+1
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }
}

