public class Q11 {
    public static void main(String[] args) {
        int a = 12, b = 35, c = 24, largest;
        if (a > b) {
            if (a > c) largest = a; else largest = c;
        } else {
            if (b > c) largest = b; else largest = c;
        }
        System.out.println("Largest: " + largest);
    }
}
