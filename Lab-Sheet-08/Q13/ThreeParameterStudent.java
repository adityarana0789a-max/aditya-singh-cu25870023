class Student<T, U, V> {
    T id; U name; V marks;
    Student(T id, U name, V marks) {
        this.id = id; this.name = name; this.marks = marks;
    }
    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}
class ThreeParameterStudent {
    public static void main(String[] args) {
        Student<Integer, String, Double> s1 = new Student<>(1, "Aman", 85.5);
        Student<Integer, String, Double> s2 = new Student<>(2, "Riya", 91.0);
        Student<Integer, String, Double> s3 = new Student<>(3, "Karan", 78.5);
        s1.display(); s2.display(); s3.display();
    }
}
