import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        String fileName = "data.txt"; // make sure this file exists

        // 1️⃣ Using BufferedReader
        System.out.println("1️⃣ Reading data using BufferedReader:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n------------------------------------\n");

        // 2️⃣ Using Scanner
        System.out.println("2️⃣ Reading data using Scanner:");
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println("\n------------------------------------\n");

        // 3️⃣ Using Scanner with delimiter
        System.out.println("3️⃣ Reading data using Scanner with delimiter ',' :");
        try (Scanner sc = new Scanner(file)) {
            sc.useDelimiter(","); // example delimiter (comma)
            while (sc.hasNext()) {
                String token = sc.next().trim();
                System.out.println(token);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
