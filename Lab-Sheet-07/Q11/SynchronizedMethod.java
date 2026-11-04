class SynchronizedMethod {
    static class BankAccount {
        int balance = 2000;
        synchronized void withdraw(int amount) {
            if (balance >= amount) balance -= amount;
        }
    }
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();
        Runnable job = () -> {
            for (int i = 0; i < 1000; i++) account.withdraw(1);
        };
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final balance: " + account.balance);
    }
}
