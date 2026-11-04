class Box<T> {
    T value;
    Box(T value) { this.value = value; }
    void display() { System.out.println(value); }
}
class GenericBox {
    public static void main(String[] args) {
        new Box<Integer>(100).display();
        new Box<String>("Hello").display();
        new Box<Double>(25.5).display();
    }
}
