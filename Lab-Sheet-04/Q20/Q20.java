class Q20 {
    double balance=5000;
    static String bankCode="BK101";
    void withdraw(double amount) {
        double remaining=balance-amount;
        if(amount>0 && amount<=balance) {
            balance=remaining;
            System.out.println("Withdrawn = "+amount);
            System.out.println("Balance = "+balance);
        } else System.out.println("Invalid withdrawal");
    }
    public static void main(String[] args) { new Q20().withdraw(1200); }
}
