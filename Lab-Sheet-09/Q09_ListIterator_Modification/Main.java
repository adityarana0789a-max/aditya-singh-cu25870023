import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Rahul");

        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Riya"))
                it.set("Priya");
            if (name.equals("Rahul"))
                it.add("Neha");
        }

        System.out.println(names);
    }
}