import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteDataThreeWays {
    public static void main(String[] args) {
        String fileName = "output.txt"; // file to write

        // 1️⃣ Using FileWriter
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Hello World\n");
            fw.write("Written using FileWriter\n");
            fw.write("Java is fun!\n");
            System.out.println("Data written successfully using FileWriter.");
        } catch (IOException e) {
            System.out.println("FileWriter Error: " + e.getMessage());
        }

        System.out.println("\n--------------------------------\n");

        // 2️⃣ Using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Hello World\n");
            bw.write("Written using BufferedWriter\n");
            bw.write("BufferedWriter is faster for large data.\n");
            System.out.println("Data written successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("BufferedWriter Error: " + e.getMessage());
        }

        System.out.println("\n--------------------------------\n");

        // 3️⃣ Using PrintWriter
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.println("Hello World");
            pw.println("Written using PrintWriter");
            pw.println("PrintWriter allows println() style writing");
            System.out.println("Data written successfully using PrintWriter.");
        } catch (FileNotFoundException e) {
            System.out.println("PrintWriter Error: " + e.getMessage());
        }
    }
}
