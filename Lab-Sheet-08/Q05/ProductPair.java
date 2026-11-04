class Product<T, U> {
    T id; U price;
    Product(T id, U price) { this.id = id; this.price = price; }
    void display() { System.out.println("Product: " + id + ", Price: " + price); }
}
class ProductPair {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 99.5);
        Product<Integer, Double> p2 = new Product<>(102, 150.0);
        Product<Integer, Double> p3 = new Product<>(103, 75.0);
        p1.display(); p2.display(); p3.display();
    }
}
