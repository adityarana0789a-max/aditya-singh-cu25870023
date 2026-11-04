import java.util.Scanner;
class InvalidDosageException extends Exception {
    InvalidDosageException(String message) { super(message); }
}
public class DosageValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient, drug and dosage(mg): ");
            String patient = sc.next();
            String drug = sc.next();
            int dosage = Integer.parseInt(sc.next());
            if (dosage <= 0 || dosage > 1000)
                throw new InvalidDosageException("Dosage must be from 1 to 1000 mg.");
            System.out.println("Valid dosage for " + patient + ": " + drug + " " + dosage + " mg");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be numeric.");
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}
