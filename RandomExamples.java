import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("===== Using Random Class =====");
        // Random integer (any value)
        int randomInt = rand.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Random integer between 0 and 99
        int randomIntBound = rand.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntBound);

        // Random double between 0.0 and 1.0
        double randomDouble = rand.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Random boolean
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random Boolean: " + randomBool);

        // Random String using Random class
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 8; // length of random string
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        System.out.println("Random String: " + randomString);

        System.out.println("\n===== Using Math.random() =====");
        // Random double between 0.0 and 1.0
        double mathRandomDouble = Math.random();
        System.out.println("Random Double: " + mathRandomDouble);

        // Random integer between 0 and 99
        int mathRandomInt = (int)(Math.random() * 100);
        System.out.println("Random Integer (0-99): " + mathRandomInt);

        // Random integer between 50 and 100
        int mathRandomRange = 50 + (int)(Math.random() * 51); // 50 to 100
        System.out.println("Random Integer (50-100): " + mathRandomRange);

        // Random String using Math.random()
        StringBuilder mathRandomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * characters.length());
            mathRandomString.append(characters.charAt(index));
        }
        System.out.println("Random String: " + mathRandomString);
    }
}
