public class Q19 {
    public static void main(String[] args) {
        double a = 12, b = 4;
        char op = '*';
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(b != 0 ? a / b : "Cannot divide by zero"); break;
            default: System.out.println("Invalid operator");
        }
    }
}
