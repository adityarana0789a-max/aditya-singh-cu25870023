class Person {
    String name = "Aman";
    int age = 20;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNo = 101;
    String course = "BCA";
    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
public class PersonStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent();
    }
}
