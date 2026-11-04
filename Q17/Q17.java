public class Q17 {
    public static void main(String[] args) {
        int n = 121, temp = n, reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (n == reverse) System.out.println(n + " is palindrome");
        else System.out.println(n + " is not palindrome");
    }
}
