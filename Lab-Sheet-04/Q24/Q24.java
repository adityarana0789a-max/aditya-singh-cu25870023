class Q24 {
    static int seriesCount=0;
    void display(int n) {
        seriesCount++;
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b; a=b; b=c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Q24 f=new Q24(); f.display(7);
        System.out.println("Series count = "+seriesCount);
    }
}
