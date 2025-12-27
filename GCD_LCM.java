 import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        // GCD using Euclid's Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a; 
        int lcm = (originalA * originalB) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
 
