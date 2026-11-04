public class Q25 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char op = '&';
        boolean x = a > 0, y = b > 0;
        switch (op) {
            case '&': System.out.println(x && y); break;
            case '|': System.out.println(x || y); break;
            case '!': System.out.println(!x); break;
            default: System.out.println("Use &, | or !");
        }
    }
}
