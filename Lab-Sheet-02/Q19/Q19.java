class Q19 {
    public static void main(String[] args) {
        for(int n=1;n<=1000;n++) {
            int temp=n, sum=0, digits=String.valueOf(n).length();
            while(temp>0) {
                int digit=temp%10;
                sum+=Math.pow(digit,digits);
                temp/=10;
            }
            if(sum==n) System.out.print(n+" ");
        }
    }
}
