class FivePriorities {
    public static void main(String[] args) throws Exception {
        for (int p = 1; p <= 9; p += 2) {
            final int priority = p;
            Thread t = new Thread(() ->
                System.out.println(Thread.currentThread().getName()
                    + " priority=" + priority));
            t.setName("Worker-" + priority);
            t.setPriority(priority);
            t.start();
            t.join();
        }
    }
}
