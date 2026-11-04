class Q18 {
    int units=120;
    static double fixedCharge=50;
    void calculate() {
        double rate=5.0;
        double total=units*rate+fixedCharge;
        System.out.println("Total bill = "+total);
    }
    public static void main(String[] args) { new Q18().calculate(); }
}
