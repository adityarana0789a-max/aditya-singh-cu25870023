import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("student_records.txt")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Student " + i);
                System.out.print("Roll Number: "); String roll = sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Course: "); String course = sc.nextLine();
                System.out.print("Marks: "); String marks = sc.nextLine();
                fw.write(roll + ", " + name + ", " + course + ", " + marks + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error writing records.");
            sc.close(); return;
        }
        System.out.println("\nAll Student Records:");
        try (BufferedReader br = new BufferedReader(new FileReader("student_records.txt"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading records.");
        }
        sc.close();
    }
}
