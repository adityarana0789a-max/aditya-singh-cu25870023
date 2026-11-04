class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Aditya");
            try { Thread.sleep(200); } catch (InterruptedException e) { }
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new RunnableDemo());
        t.start();
        t.join();
    }
}
