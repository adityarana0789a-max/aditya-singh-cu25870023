import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.next();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.split("\\W+"))
                    if (w.equalsIgnoreCase(word)) count++;
            }
            if (count > 0) System.out.println("Word found " + count + " time(s).");
            else System.out.println("Word not found.");
        } catch (IOException e) {
            System.out.println("Error: notes.txt not found.");
        }
        sc.close();
    }
}
