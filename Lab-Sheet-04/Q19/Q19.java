class Q19 {
    int id=101; String name="Keyboard"; double price=1000;
    static double discountRate=10;
    void display() {
        double discount=price*discountRate/100;
        double finalPrice=price-discount;
        System.out.println(id+" "+name);
        System.out.println("Final price = "+finalPrice);
    }
    public static void main(String[] args) { new Q19().display(); }
}
