interface Researcher { void conductResearch(); }
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    public void setDetails(int id, String name, double s) {
        employeeId = id; employeeName = name; salary = s;
    }
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + calculateSalary());
    }
    public double calculateSalary() { return salary; }
}
class Teacher extends Employee implements Researcher {
    String subject = "Computer Science";
    void teach() { System.out.println("Teaching: " + subject); }
    public void conductResearch() { System.out.println("Teacher conducts research"); }
    @Override public double calculateSalary() { return super.calculateSalary() + 5000; }
}
class VisitingTeacher extends Teacher {
    int hoursWorked = 10;
    @Override public double calculateSalary() { return super.calculateSalary() + hoursWorked * 500; }
}
class Admin extends Employee {
    String department = "Administration";
    void manageDepartment() { System.out.println("Managing: " + department); }
}
public class UniversitySystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setDetails(1, "Meena", 40000);
        t.displayDetails(); t.teach(); t.conductResearch();
        VisitingTeacher v = new VisitingTeacher();
        v.setDetails(2, "Ravi", 30000);
        v.displayDetails();
        Admin a = new Admin();
        a.setDetails(3, "Neha", 35000);
        a.displayDetails(); a.manageDepartment();
    }
}
