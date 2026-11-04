public class Q30 {
    public static void main(String[] args) {
        double a = 18, b = 6;
        char op = '/';
        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero"); break;
            default: System.out.println("Invalid operator");
        }
    }
}
