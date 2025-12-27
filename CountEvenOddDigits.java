import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        int n = Math.abs(num);  // Handle negative numbers

        // Special case: number = 0
        if (n == 0) {
            evenCount = 1;  // 0 is considered an even digit
        } else {
            while (n > 0) {
                int digit = n % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                n = n / 10;
            }
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits:  " + oddCount);
    }
}
