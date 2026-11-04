import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Neha");
        students.add("Karan");
        students.add("Priya");
        students.add("Vikas");
        students.add("Simran");
        students.add("Arjun");
        students.add("Meena");

        for (String name : students)
            System.out.println(name);
        System.out.println("Total students: " + students.size());
    }
}