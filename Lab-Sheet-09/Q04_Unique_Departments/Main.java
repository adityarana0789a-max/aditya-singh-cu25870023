import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("CSE");
        departments.add("IT");
        departments.add("ECE");
        departments.add("CSE");
        departments.add("BCA");
        departments.add("IT");

        System.out.println("Unique departments: " + departments);
    }
}