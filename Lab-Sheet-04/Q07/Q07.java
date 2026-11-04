class Q07 {
    int accountNumber=12345; double balance=1000;
    static String bankName=" SBI";
    void deposit(double amount) {
        double newBalance=balance+amount;
        balance=newBalance;
        System.out.println("Bank = "+bankName);
        System.out.println("Account = "+accountNumber);
        System.out.println("Balance = "+balance);
    }
    public static void main(String[] args) { new Q07().deposit(500); }
}
