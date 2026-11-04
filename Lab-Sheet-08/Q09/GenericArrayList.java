import java.util.*;
class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) list.add(i * 10);
        for (int n : list) System.out.print(n + " ");
    }
}
