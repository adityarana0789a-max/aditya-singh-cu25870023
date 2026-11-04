public class Q28 {
    public static void main(String[] args) {
        int n = 58321, count = 0;
        n = Math.abs(n);
        if (n == 0) count = 1;
        while (n > 0) { count++; n /= 10; }
        System.out.println("Number of digits: " + count);
    }
}
