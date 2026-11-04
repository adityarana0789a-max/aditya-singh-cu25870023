class SynchronizedBlock {
    static class BankAccount {
        int balance = 2000;
        private final Object lock = new Object();
        void withdraw(int amount) {
            synchronized (lock) {
                if (balance >= amount) balance -= amount;
            }
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
