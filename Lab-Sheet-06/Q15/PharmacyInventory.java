import java.util.Scanner;
class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) { super(message); }
}
class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) { super(message); }
}
public class PharmacyInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter medicine, available and required quantity: ");
            String medicine = sc.next();
            int available = Integer.parseInt(sc.next());
            int required = Integer.parseInt(sc.next());
            if (available < 0 || required < 0)
                throw new InvalidQuantityException("Quantity cannot be negative.");
            if (required > available)
                throw new InsufficientMedicineStockException("Insufficient medicine stock.");
            System.out.println("Issued " + required + " units of " + medicine);
            System.out.println("Remaining quantity: " + (available - required));
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity must be numeric.");
        } finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}
