import java.util.Scanner;
public class NestedTryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {11, 22, 33, 44, 55};
        try {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("Division: " + (x / y));
            try {
                System.out.print("Enter array index (0-4): ");
                int i = sc.nextInt();
                System.out.println("Element: " + a[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
