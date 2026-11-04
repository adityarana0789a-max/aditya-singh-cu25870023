class TwoThreads {
    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> {
            for (int i = 1; i <= 5; i++) System.out.println("Thread-A: " + i);
        });
        Thread b = new Thread(() -> {
            for (int i = 1; i <= 5; i++) System.out.println("Thread-B: " + i);
        });
        a.setName("Thread-A");
        b.setName("Thread-B");
        a.start(); b.start();
        a.join(); b.join();
    }
}
