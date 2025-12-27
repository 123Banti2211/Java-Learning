import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Taking input from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Using normal for loop
        System.out.println("\nUsing normal for loop:");
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Using enhanced for-each loop
        System.out.println("\n\nUsing enhanced for-each loop:");
        System.out.print("Even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
