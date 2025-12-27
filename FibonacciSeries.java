import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;   // next term
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
