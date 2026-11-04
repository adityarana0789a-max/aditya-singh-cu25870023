class RaceCondition {
    static class BankAccount {
        int balance = 2000;
        void withdraw(int amount) {
            if (balance >= amount) {
                int current = balance;
                Thread.yield();
                balance = current - amount;
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
        System.out.println("Expected balance: 0");
        System.out.println("Actual balance: " + account.balance);
        System.out.println("Unsynchronized access can cause a race condition.");
    }
}
