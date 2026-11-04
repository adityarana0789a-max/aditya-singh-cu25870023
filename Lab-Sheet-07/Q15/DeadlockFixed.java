class DeadlockFixed {
    public static void main(String[] args) throws Exception {
        Object Lock1 = new Object();
        Object Lock2 = new Object();

        Runnable job = () -> {
            synchronized (Lock1) {
                synchronized (Lock2) {
                    System.out.println(Thread.currentThread().getName()
                        + " acquired Lock1 and Lock2");
                }
            }
        };
        Thread t1 = new Thread(job, "Thread-1");
        Thread t2 = new Thread(job, "Thread-2");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Program completed without deadlock.");
    }
}
