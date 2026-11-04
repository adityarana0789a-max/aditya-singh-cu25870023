class Q23 {
    static int totalPrimeChecks=0;
    boolean isPrime(int n) {
        totalPrimeChecks++;
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Q23 p=new Q23();
        System.out.println(p.isPrime(17)?"Prime":"Not prime");
        System.out.println("Checks = "+totalPrimeChecks);
    }
}
