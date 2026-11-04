import java.util.Scanner;
class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) { super(message); }
}
public class PatientRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name and age: ");
            String name = sc.next();
            int age = Integer.parseInt(sc.next());
            if (age < 0 || age > 120)
                throw new InvalidPatientAgeException("Age must be between 0 and 120.");
            System.out.println("Registration successful: " + name + ", age " + age);
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be numeric.");
        }
    }
}
