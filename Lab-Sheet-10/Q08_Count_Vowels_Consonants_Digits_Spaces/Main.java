import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        try (FileReader fr = new FileReader("input.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                if ("aeiouAEIOU".indexOf(c) >= 0) vowels++;
                else if (Character.isLetter(c)) consonants++;
                else if (Character.isDigit(c)) digits++;
                else if (c == ' ') spaces++;
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("Error reading input.txt");
        }
    }
}
