class Person {
    String name;
    Person(String n) { name = n; }
    void displayName() { System.out.println("Name: " + name); }
}
class Student extends Person {
    String course = "BCA";
    Student(String n) { super(n); }
    void study() { displayName(); System.out.println("Course: " + course); System.out.println("Student is studying"); }
}
class Teacher extends Person {
    String subject = "Java";
    Teacher(String n) { super(n); }
    void teach() { displayName(); System.out.println("Subject: " + subject); System.out.println("Teacher is teaching"); }
}
public class PersonRoles {
    public static void main(String[] args) {
        new Student("Aman").study();
        new Teacher("Meena").teach();
    }
}
