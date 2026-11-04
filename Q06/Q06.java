class Q06 {
    public static void main(String[] args) {
        double n=64;
        int steps=0;
        while(n>=1) { n/=2; steps++; }
        System.out.println("Steps = " + steps);
        System.out.println("Final value = " + n);
    }
}
