import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // 1️⃣ Largest using Logic (if-else)
        int largestLogic;
        if (a >= b && a >= c) {
            largestLogic = a;
        } else if (b >= a && b >= c) {
            largestLogic = b;
        } else {
            largestLogic = c;
        }

        // 2️⃣ Largest using Ternary Operator
        int largestTernary = (a > b) ? ( (a > c) ? a : c ) 
                                     : ( (b > c) ? b : c );

        // Print results
        System.out.println("\n----- Results -----");
        System.out.println("Largest (Logic)   : " + largestLogic);
        System.out.println("Largest (Ternary) : " + largestTernary);
    }
}
