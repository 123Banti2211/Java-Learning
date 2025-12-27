import java.util.Scanner;

public class ReverseNumberWays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1️⃣ Reverse using Algorithm (Mathematical way)
        int n = num;
        int revAlgo = 0;
        while (n != 0) {
            int digit = n % 10;
            revAlgo = revAlgo * 10 + digit;
            n = n / 10;
        }

        // 2️⃣ Reverse using StringBuffer
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        String revSB = sb.reverse().toString();

// StringBuffer is a mutable (changeable) class in Java, meaning we can modify the string without creating new objects.

// String.valueOf(num) converts the integer num to a String.

// We pass that string inside StringBuffer.
// How it reverses?

// sb.reverse() is an inbuilt method that reverses the characters in the StringBuffer object.

// .toString() converts the reversed StringBuffer back to a simple String.

        // 3️⃣ Reverse using StringBuilder
        StringBuilder sbd = new StringBuilder(String.valueOf(num));
        String revSBD = sbd.reverse().toString();

// StringBuilder is similar to StringBuffer, but faster, and not thread-safe.

// Converts number → string → StringBuilder.

// How it reverses?

// sbd.reverse() reverses the characters.

// .toString() converts the reversed result back to a normal string.

        // Print outputs
        System.out.println("\n----- Reversed in Different Ways -----");
        System.out.println("Using Algorithm (while loop): " + revAlgo);
        System.out.println("Using StringBuffer:           " + revSB);
        System.out.println("Using StringBuilder:          " + revSBD);
    }
}

