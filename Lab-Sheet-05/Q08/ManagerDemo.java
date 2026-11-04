class Person {
    String name = "Karan";
    void displayName() { System.out.println("Name: " + name); }
}
class Employee extends Person {
    int employeeId = 201;
    void displayEmployee() { System.out.println("Employee ID: " + employeeId); }
}
class Manager extends Employee {
    String department = "Sales";
    void displayManager() {
        displayName();
        displayEmployee();
        System.out.println("Department: " + department);
    }
}
public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayManager();
    }
}
