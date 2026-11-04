class Q10 {
    String name="3 Idiots", genre="Comedy"; double rating=8.4;
    static String industry="Bollywood";
    void display() {
        String n=name, g=genre; double r=rating;
        System.out.println(n+" | "+g+" | "+r);
        System.out.println(industry);
    }
    public static void main(String[] args) { new Q10().display(); }
}
