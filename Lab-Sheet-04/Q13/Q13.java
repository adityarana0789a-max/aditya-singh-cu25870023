class Q13 {
    double celsius=25;
    static String scale="Celsius";
    void convert() {
        double f=(celsius*9/5)+32;
        double k=celsius+273.15;
        System.out.println(scale+" = "+celsius);
        System.out.println("Fahrenheit = "+f);
        System.out.println("Kelvin = "+k);
    }
    public static void main(String[] args) { new Q13().convert(); }
}
