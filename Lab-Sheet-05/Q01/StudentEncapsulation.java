class Student {
    private String name;
    private int rollNo;
    private double marks;
    public void setName(String n) { name = n; }
    public void setRollNo(int r) { rollNo = r; }
    public void setMarks(double m) { marks = m; }
    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }
}
public class StudentEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setRollNo(101);
        s.setMarks(85.5);
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}
