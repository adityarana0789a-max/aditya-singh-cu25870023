import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write("Student Name: Rahul\nRoll Number: 101\nCourse: BCA\nSemester: 2");
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
