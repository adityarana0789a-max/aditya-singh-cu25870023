import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("source.txt");
             FileWriter out = new FileWriter("backup.txt")) {
            int ch;
            while ((ch = in.read()) != -1) out.write(ch);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: source.txt not found or copy failed.");
        }
    }
}
