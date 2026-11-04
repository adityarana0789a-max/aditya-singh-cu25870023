import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();

        patients.add("Aman");
        patients.add("Riya");
        patientIds.add("P101");
        patientIds.add("P102");

        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + patientIds);

        patients.remove("Aman");
        patientIds.remove("P101");
        System.out.println("After removal: " + patients);
        System.out.println("Search Riya: " + patients.contains("Riya"));
        System.out.println("Final records: " + patients + " " + patientIds);
    }
}