import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 20, 10, 30, 20, 40};

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("List keeps duplicates; Set stores unique values.");
        System.out.println("ArrayList preserves insertion order; HashSet does not guarantee order.");
    }
}