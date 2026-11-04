import java.util.Scanner;
public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {5, 10, 15, 20, 25};
        try {
            System.out.print("Enter two numbers: ");
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            System.out.println("Division: " + (x / y));
            System.out.print("Enter array index (0-4): ");
            int i = Integer.parseInt(sc.next());
            System.out.println("Element: " + a[i]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid integers.");
        }
    }
}
