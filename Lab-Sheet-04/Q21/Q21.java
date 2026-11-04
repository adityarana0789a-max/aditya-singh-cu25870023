class Q21 {
    static int countChecks=0;
    boolean check(int n) {
        countChecks++;
        int temp=n, rev=0;
        while(temp>0){ rev=rev*10+temp%10; temp/=10; }
        return n==rev;
    }
    public static void main(String[] args) {
        Q21 p=new Q21();
        System.out.println(p.check(121)?"Palindrome":"Not palindrome");
        System.out.println("Checks = "+countChecks);
    }
}
