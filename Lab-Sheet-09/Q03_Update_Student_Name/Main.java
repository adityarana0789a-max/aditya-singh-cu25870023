import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Neha");
        students.add("Karan");

        students.set(1, "Priya");
        students.remove(3);

        System.out.println(students);
    }
}