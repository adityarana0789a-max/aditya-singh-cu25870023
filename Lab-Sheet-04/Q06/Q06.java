class Q06 {
    String brand="Toyota"; double mileage=18.5;
    static int wheels=4;
    void display() {
        String b=brand; double m=mileage;
        System.out.println("Brand = "+b);
        System.out.println("Mileage = "+m);
        System.out.println("Wheels = "+wheels);
    }
    public static void main(String[] args) { new Q06().display(); }
}
