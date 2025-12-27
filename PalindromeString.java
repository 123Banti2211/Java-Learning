import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String original = str;
        String reverse = "";

        // Reverse the string manually
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Check palindrome (ignore case)
        if (original.equals(reverse)) {
            System.out.println(original + " is a Palindrome string.");
        } else {
            System.out.println(original + " is NOT a Palindrome string.");
        }
    }
}
