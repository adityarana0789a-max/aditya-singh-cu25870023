import java.util.*;
class GenericListMethod {
    static <T> void display(ArrayList<T> list) {
        for (T item : list) System.out.print(item + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aman", "Riya", "Raj"));
        display(nums);
        display(names);
    }
}
