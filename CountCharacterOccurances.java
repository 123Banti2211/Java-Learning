import java.util.Scanner;
public class CountCharacterOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        // Using normal for loop
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' occurs " + count + " times in the string.");

        sc.close();
    }
}


