class Q25 {
    static int totalCalls=0;
    long factorial(int n) {
        totalCalls++;
        long fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        return fact;
    }
    public static void main(String[] args) {
        Q25 f=new Q25();
        System.out.println("Factorial = "+f.factorial(5));
        System.out.println("Calls = "+totalCalls);
    }
}
