import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Remove all spaces
        String noSpaces = input.replaceAll("\\s", "");

        System.out.println("String after removing all white spaces: " + noSpaces);

        sc.close();
    }
}
