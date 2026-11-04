class JoinDemo {
    public static void main(String[] args) throws Exception {
        Thread task = new Thread(() -> {
            long sum = 0;
            for (int i = 1; i <= 10000; i++) sum += i;
            System.out.println("Sum = " + sum);
        });
        task.start();
        task.join();
        System.out.println("Task finished");
    }
}
