class Q15 {
    double principal=10000, rate=5, time=2;
    static String bank="National Bank";
    void calculate() {
        double interest=principal*rate*time/100;
        System.out.println(bank);
        System.out.println("Simple Interest = "+interest);
    }
    public static void main(String[] args) { new Q15().calculate(); }
}
