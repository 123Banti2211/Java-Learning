import java.util.Scanner;

public class ReverseStringWays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1️⃣ Reverse using concatenation operator (+)
        String revConcat = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revConcat = revConcat + str.charAt(i);
        }
//         ✔ How it works:

// Start from last index of the string.

// str.charAt(i) picks characters from end to beginning.

// Add each character one-by-one into revConcat.

// Example:

// Input → "Java"
// Loop → a → av → ava → avaJ

        // 2️⃣ Reverse using character array
        char[] arr = str.toCharArray();
        String revCharArray = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revCharArray = revCharArray + arr[i];
        }
// ✔ How it works:

// toCharArray() converts the string into an array of characters.

// Loop runs from last element to first.

// Builds reversed string by adding characters backwards.

// Why use array?

// Faster access to characters.

// Useful in problems involving indexing.

        // 3️⃣ Reverse using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        String revSB = sb.reverse().toString();

// ✔ How it works:

// StringBuffer allows changes to its content.

// .reverse() is an inbuilt method that automatically reverses the characters.

// toString() converts the result back to a normal String.
        // Print outputs
        System.out.println("\n----- Reversed String (Different Ways) -----");
        System.out.println("Using Concatenation (+): " + revConcat);
        System.out.println("Using Character Array:   " + revCharArray);
        System.out.println("Using StringBuffer:       " + revSB);
    }
}
