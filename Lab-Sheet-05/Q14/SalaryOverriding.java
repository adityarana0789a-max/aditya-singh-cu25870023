class Employee {
    double calculateSalary() { return 30000; }
}
class Manager extends Employee {
    @Override double calculateSalary() { return 50000 + 5000; }
}
public class SalaryOverriding {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        System.out.println("Employee salary: " + e.calculateSalary());
        System.out.println("Manager salary: " + m.calculateSalary());
    }
}
