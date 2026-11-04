import java.util.concurrent.CountDownLatch;

class DeadlockDemo {
    public static void main(String[] args) throws Exception {
        Object Lock1 = new Object();
        Object Lock2 = new Object();
        CountDownLatch ready = new CountDownLatch(2);

        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                ready.countDown();
                try { ready.await(); } catch (InterruptedException e) { }
                synchronized (Lock2) { System.out.println("Thread 1 finished"); }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                ready.countDown();
                try { ready.await(); } catch (InterruptedException e) { }
                synchronized (Lock1) { System.out.println("Thread 2 finished"); }
            }
        }, "Thread-2");

        // Daemon threads let the demo JVM exit even though the two threads deadlock.
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start(); t2.start();
        Thread.sleep(300);
        System.out.println("Thread-1 state: " + t1.getState());
        System.out.println("Thread-2 state: " + t2.getState());
        System.out.println("Both threads are BLOCKED: deadlock demonstrated.");
    }
}
