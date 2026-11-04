import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("DBMS");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course: ");
        String course = sc.nextLine();

        if (courses.contains(course))
            System.out.println("Course found");
        else
            System.out.println("Course not found");
        sc.close();
    }
}