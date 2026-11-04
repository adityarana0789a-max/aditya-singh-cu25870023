import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add(1, "C++");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add(1, "C++");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        arrayList.remove("C++");
        linkedList.remove("C++");
        System.out.println("ArrayList after delete: " + arrayList);
        System.out.println("LinkedList after delete: " + linkedList);
        System.out.println("Sizes: " + arrayList.size() + ", " + linkedList.size());

        System.out.println("ArrayList iteration:");
        for (String item : arrayList) System.out.println(item);
        System.out.println("LinkedList iteration:");
        for (String item : linkedList) System.out.println(item);
        System.out.println("Observation: ArrayList is good for fast index access; LinkedList is useful for frequent insertions/deletions.");
    }
}