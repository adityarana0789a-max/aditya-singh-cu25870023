import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("OS");
        courses.add("Networking");

        ListIterator<String> it = courses.listIterator();
        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Next index: " + it.nextIndex());
        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println("Previous index: " + it.previousIndex());
    }
}