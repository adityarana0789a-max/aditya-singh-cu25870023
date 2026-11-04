class Q22 {
    static int totalChecks=0;
    boolean check(int n) {
        totalChecks++;
        int temp=n, sum=0, digits=String.valueOf(n).length();
        while(temp>0){ int d=temp%10; sum+=(int)Math.pow(d,digits); temp/=10; }
        return sum==n;
    }
    public static void main(String[] args) {
        Q22 a=new Q22();
        System.out.println(a.check(153)?"Armstrong":"Not Armstrong");
        System.out.println("Checks = "+totalChecks);
    }
}
