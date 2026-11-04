import java.util.*;
class SearchGenericList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int n = sc.nextInt();
        System.out.println(list.contains(n) ? "Number found" : "Number not found");
    }
}
