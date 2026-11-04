class Employee {
    private String name = "Aman";
    private int employeeId = 501;
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
interface Programmer { void writeCode(); }
interface Researcher { void conductResearch(); }
class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() { System.out.println("Developer writes Java code"); }
    public void conductResearch() { System.out.println("Developer conducts research"); }
}
public class DeveloperDemo {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
