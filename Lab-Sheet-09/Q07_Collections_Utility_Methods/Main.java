import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 2, 8, 2, 9, 1);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reverse: " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Frequency of 2: " + Collections.frequency(numbers, 2));
    }
}