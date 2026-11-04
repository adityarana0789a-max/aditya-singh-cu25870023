public class Q26 {
    public static void main(String[] args) {
        int n = 12341;
        int last = n % 10, first = n;
        while (first >= 10) first /= 10;
        System.out.println(first == last ? "First and last digits are same" : "Digits are different");
    }
}
