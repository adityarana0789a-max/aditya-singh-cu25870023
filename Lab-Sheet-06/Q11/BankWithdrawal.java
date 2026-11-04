import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { super(message); }
}
public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter balance and withdrawal: ");
            double balance = Double.parseDouble(sc.next());
            double amount = Double.parseDouble(sc.next());
            if (amount < 0) throw new IllegalArgumentException("Withdrawal cannot be negative.");
            if (amount > balance) throw new InsufficientBalanceException("Insufficient balance.");
            System.out.println("Withdrawal successful. Balance: " + (balance - amount));
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
    }
}
