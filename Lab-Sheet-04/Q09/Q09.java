class Q09 {
    String brand="HP"; int RAM=8;
    static String os="Windows";
    void display() {
        String b=brand; int r=RAM;
        System.out.println("Brand = "+b+", RAM = "+r+" GB");
        System.out.println("OS = "+os);
    }
    public static void main(String[] args) { new Q09().display(); }
}
