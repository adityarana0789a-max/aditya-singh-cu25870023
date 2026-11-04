class Employee {
    String name; int id;
    Employee(String n, int i) { name = n; id = i; }
    void displayEmployee() { System.out.println("Name: " + name + ", ID: " + id); }
}
class Developer extends Employee {
    String language = "Java";
    Developer(String n, int i) { super(n, i); }
    void writeCode() { displayEmployee(); System.out.println("Language: " + language); }
}
class Manager extends Employee {
    String department = "HR";
    Manager(String n, int i) { super(n, i); }
    void conductMeeting() { displayEmployee(); System.out.println("Department: " + department); }
}
public class EmployeeRoles {
    public static void main(String[] args) {
        new Developer("Aman", 10).writeCode();
        new Manager("Riya", 20).conductMeeting();
    }
}
