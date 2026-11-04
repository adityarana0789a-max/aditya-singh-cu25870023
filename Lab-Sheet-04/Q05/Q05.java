class Q05 {
    String title="Java Basics", author="James";
    double price=450;
    static String publisher="Tech Books";
    void display() {
        String t=title, a=author; double p=price;
        System.out.println(t+" by "+a);
        System.out.println("Price = "+p+", Publisher = "+publisher);
    }
    public static void main(String[] args) { new Q05().display(); }
}
