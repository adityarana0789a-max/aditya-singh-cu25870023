import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();
        ids.add(105);
        ids.add(102);
        ids.add(108);
        ids.add(102);
        ids.add(104);
        ids.add(106);

        System.out.println("Unique sorted IDs: " + ids);
        System.out.println("First: " + ids.first());
        System.out.println("Last: " + ids.last());
        System.out.println("Higher than 104: " + ids.higher(104));
        System.out.println("Lower than 104: " + ids.lower(104));
    }
}