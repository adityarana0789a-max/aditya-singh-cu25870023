import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        addStudent(students, uniqueIds, sortedIds, 103, "Riya");
        addStudent(students, uniqueIds, sortedIds, 101, "Aman");
        addStudent(students, uniqueIds, sortedIds, 105, "Neha");
        addStudent(students, uniqueIds, sortedIds, 102, "Rahul");
        addStudent(students, uniqueIds, sortedIds, 104, "Karan");

        System.out.println("All students: " + students);
        System.out.println("Unique IDs (HashSet): " + uniqueIds);
        System.out.println("Sorted IDs (TreeSet): " + sortedIds);

        int searchId = 103;
        System.out.println("Search ID " + searchId + ": " + uniqueIds.contains(searchId));
        System.out.println("Total students: " + students.size());

        students.removeIf(s -> s.id == 105);
        uniqueIds.remove(105);
        sortedIds.remove(105);
        System.out.println("After removing ID 105: " + students);

        System.out.println("Forward traversal:");
        ListIterator<Student> it = students.listIterator();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("Backward traversal:");
        while (it.hasPrevious()) System.out.println(it.previous());

        System.out.println("List allows duplicates and keeps insertion order.");
        System.out.println("Set stores unique IDs; SortedSet keeps IDs sorted.");
    }

    static void addStudent(ArrayList<Student> list, HashSet<Integer> set,
                           TreeSet<Integer> sorted, int id, String name) {
        if (set.add(id)) {
            list.add(new Student(id, name));
            sorted.add(id);
        }
    }
}