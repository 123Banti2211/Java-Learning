import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = str.trim().split("\\s+");

        int wordCount = 0;
        if (str.trim().length() != 0) {
            wordCount = words.length;
        }

        System.out.println("Number of words in the string: " + wordCount);

        sc.close();
    }
}
