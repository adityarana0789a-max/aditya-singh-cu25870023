class ProducerConsumer {
    static class Buffer {
        private int value;
        private boolean available = false;
        synchronized void put(int n) throws InterruptedException {
            while (available) wait();
            value = n;
            available = true;
            System.out.println("Produced: " + n);
            notify();
        }
        synchronized int get() throws InterruptedException {
            while (!available) wait();
            int n = value;
            available = false;
            System.out.println("Consumed: " + n);
            notify();
            return n;
        }
    }
    public static void main(String[] args) throws Exception {
        Buffer b = new Buffer();
        Thread producer = new Thread(() -> {
            try { for (int i = 1; i <= 10; i++) b.put(i); }
            catch (InterruptedException e) { }
        });
        Thread consumer = new Thread(() -> {
            try { for (int i = 1; i <= 10; i++) b.get(); }
            catch (InterruptedException e) { }
        });
        producer.start(); consumer.start();
        producer.join(); consumer.join();
    }
}
