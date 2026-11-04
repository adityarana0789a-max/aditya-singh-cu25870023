class Container<T> {
    T value;
    void add(T value) { this.value = value; }
    T get() { return value; }
}
class GenericContainer {
    public static void main(String[] args) {
        Container<Integer> a = new Container<>();
        Container<String> b = new Container<>();
        Container<Double> c = new Container<>();
        a.add(50); b.add("Java"); c.add(9.5);
        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
    }
}
