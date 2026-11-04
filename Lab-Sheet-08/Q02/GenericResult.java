class Result<T> {
    T marks;
    Result(T marks) { this.marks = marks; }
    void display() { System.out.println("Marks: " + marks); }
}
class GenericResult {
    public static void main(String[] args) {
        new Result<Integer>(85).display();
        new Result<Double>(92.5).display();
    }
}
