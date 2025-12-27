import java.util.Scanner;

public class ArraySum {
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

        // Sum using normal for loop
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        System.out.println("Sum using normal for loop: " + sum1);

        // Sum using enhanced for-each loop
        int sum2 = 0;
        for (int num : numbers) {
            sum2 += num;
        }
        System.out.println("Sum using enhanced for-each loop: " + sum2);

        sc.close();
    }
}
