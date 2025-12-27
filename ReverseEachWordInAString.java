public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String str = "Welcome To Java";  // Original string
        String[] words = str.split(" "); // Split into words

        String reverseString = "";

        // Enhanced for loop for words
        for (String w : words) {

            String reverseWord = "";

            // Normal for loop to reverse each word
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + w.charAt(i);
            }

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed Each Word: " + reverseString.trim());
    }
}
