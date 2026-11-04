class NamedThreads {
    public static void main(String[] args) throws Exception {
        String[] names = {"Reader", "Writer", "Logger"};
        String[] messages = {"Reading data", "Writing data", "Logging activity"};
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            final int n = i;
            threads[i] = new Thread(() -> {
                try { Thread.sleep((long)(Math.random() * 501)); }
                catch (InterruptedException e) { }
                System.out.println(Thread.currentThread().getName() + ": " + messages[n]);
            }, names[i]);
            threads[i].start();
        }
        for (Thread t : threads) t.join();
    }
}
