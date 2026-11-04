class Employee<T, U> {
    T id; U name;
    Employee(T id, U name) { this.id = id; this.name = name; }
    void display() { System.out.println("ID: " + id + ", Name: " + name); }
}
class GenericEmployee {
    public static void main(String[] args) {
        Employee<Integer, String> e = new Employee<>(501, "Riya");
        e.display();
    }
}
