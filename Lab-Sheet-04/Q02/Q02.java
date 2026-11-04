class Q02 {
    double length=5, breadth=4;
    static String shapeName="Rectangle";
    void area() {
        double result=length*breadth;
        System.out.println(shapeName+" area = "+result);
    }
    public static void main(String[] args) { new Q02().area(); }
}
