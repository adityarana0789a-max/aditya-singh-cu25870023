import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("employees.txt")) {
            fw.write("E101, Rahul, IT, 30000\n");
            fw.write("E102, Aman, HR, 25000\n");
        } catch (IOException e) {
            System.out.println("Error creating employee file.");
            sc.close(); return;
        }
        System.out.print("Enter Employee ID to search: ");
        String id = sc.nextLine();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(id + ",")) {
                    System.out.println("Employee Record: " + line);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Employee record not found.");
        } catch (IOException e) {
            System.out.println("Employee file does not exist.");
        }
        sc.close();
    }
}
