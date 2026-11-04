import java.util.*;
class Student<T, U, V> {
    T id; U name; V marks;
    Student(T id, U name, V marks) {
        this.id = id; this.name = name; this.marks = marks;
    }
    void display() { System.out.println(id + " " + name + " " + marks); }
}
class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> list = new ArrayList<>();
        list.add(new Student<>(101, "Aman", 85.5));
        list.add(new Student<>(102, "Riya", 91.0));
        list.add(new Student<>(103, "Karan", 78.0));
        list.add(new Student<>(104, "Neha", 88.5));
        list.add(new Student<>(105, "Raj", 80.0));

        System.out.println("All Students:");
        for (Student<Integer, String, Double> s : list) s.display();

        int searchId = 103;
        boolean found = false;
        for (Student<Integer, String, Double> s : list) {
            if (s.id.equals(searchId)) {
                System.out.println("Found: " + s.id + " " + s.name);
                found = true;
            }
        }
        if (!found) System.out.println("Student not found");
        System.out.println("Total students: " + list.size());
        System.out.println("Type safety: Integer ID, String name, Double marks");
    }
}
