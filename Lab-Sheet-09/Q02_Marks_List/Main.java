import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        System.out.println("First: " + marks.get(0));
        System.out.println("Middle: " + marks.get(marks.size() / 2));
        System.out.println("Last: " + marks.get(marks.size() - 1));
    }
}