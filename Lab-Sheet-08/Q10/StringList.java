import java.util.*;
class StringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(
            Arrays.asList("Aman", "Riya", "Karan", "Neha", "Raj"));
        names.add("Simran");
        System.out.println("Added: " + names);
        System.out.println("get(1): " + names.get(1));
        names.set(0, "Aditya");
        names.remove("Karan");
        System.out.println("Updated: " + names);
        System.out.println("Size: " + names.size());
    }
}
