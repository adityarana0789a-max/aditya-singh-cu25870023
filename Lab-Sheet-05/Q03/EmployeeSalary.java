class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    public void setDetails(int id, String name) { employeeId = id; employeeName = name; }
    public void setSalary(double s) {
        if (s >= 0 && s <= 1000000) { salary = s; System.out.println("Salary accepted"); }
        else System.out.println("Invalid salary");
    }
    public void display() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setDetails(1, "Riya");
        e.setSalary(45000);
        e.setSalary(-500);
        e.display();
    }
}
