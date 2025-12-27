import java.util.*;

public class AllPatterns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== PATTERN MENU =====");
            System.out.println("1. Half Pyramid");
            System.out.println("2. Inverted Half Pyramid");
            System.out.println("3. Full Pyramid");
            System.out.println("4. Inverted Full Pyramid");
            System.out.println("5. Right-Aligned Triangle");
            System.out.println("6. Number Pyramid");
            System.out.println("7. Floyd's Triangle");
            System.out.println("8. Diamond Pattern");
            System.out.println("9. Hollow Square");
            System.out.println("10. X Pattern");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 11) {
                System.out.println("Program Ended.");
                break;
            }

            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            switch (choice) {

                case 1: // Half Pyramid
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Inverted Half Pyramid
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Full Pyramid
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++)
                            System.out.print(" ");
                        for (int st = 1; st <= 2 * i - 1; st++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 4: // Inverted Full Pyramid
                    for (int i = n; i >= 1; i--) {
                        for (int s = 1; s <= n - i; s++)
                            System.out.print(" ");
                        for (int st = 1; st <= 2 * i - 1; st++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 5: // Right-Aligned Triangle
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 6: // Number Pyramid
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;

                case 7: // Floyd's Triangle
                    int num = 1;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + " ");
                            num++;
                        }
                        System.out.println();
                    }
                    break;

                case 8: // Diamond Pattern
                    // upper part
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++)
                            System.out.print(" ");
                        for (int st = 1; st <= 2 * i - 1; st++)
                            System.out.print("*");
                        System.out.println();
                    }
                    // lower part
                    for (int i = n - 1; i >= 1; i--) {
                        for (int s = 1; s <= n - i; s++)
                            System.out.print(" ");
                        for (int st = 1; st <= 2 * i - 1; st++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 9: // Hollow Square
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == 1 || j == n)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 10: // X Pattern
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == i || j == n - i + 1)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
                    break;
            }
        }
    }
}
