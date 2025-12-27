import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with special characters: ");
        String input = sc.nextLine();

        // Remove all non-alphanumeric characters
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("String after removing special characters: " + cleanedString);

        sc.close();
    }
}
