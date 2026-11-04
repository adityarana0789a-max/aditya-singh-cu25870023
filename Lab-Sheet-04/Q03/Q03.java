class Q03 {
    double radius=7;
    static final double PI=3.14;
    void calculate() {
        double area=PI*radius*radius;
        double circumference=2*PI*radius;
        System.out.println("Area = "+area);
        System.out.println("Circumference = "+circumference);
    }
    public static void main(String[] args) { new Q03().calculate(); }
}
