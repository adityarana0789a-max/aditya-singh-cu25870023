class Pair<T, U> {
    T id; U name;
    Pair(T id, U name) { this.id = id; this.name = name; }
    void display() { System.out.println(id + " " + name); }
}
class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "Aman");
        p.display();
    }
}
