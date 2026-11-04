class AccountData {
    private String accountNumber = "12345";
    private String accountHolder = "Aman";
    private double balance = 5000;
    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposit successful"); }
        else System.out.println("Invalid deposit amount");
    }
    public void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal amount");
        else if (amount > balance) System.out.println("Insufficient balance");
        else { balance -= amount; System.out.println("Withdrawal successful"); }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        AccountData account = new AccountData();
        account.deposit(1000);
        account.withdraw(1500);
        System.out.println("Balance: " + account.getBalance());
    }
}
