class Q08 {
    String color="Blue", type="Ball Pen";
    static String manufacturer="Cello";
    void display() {
        String c=color, t=type;
        System.out.println(c+" "+t);
        System.out.println("Manufacturer = "+manufacturer);
    }
    public static void main(String[] args) { new Q08().display(); }
}
