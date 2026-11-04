import java.util.Scanner;
class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean powerOfFour=n>0 && (n&(n-1))==0 && (n&0x55555555)!=0;
        System.out.println("Power of 4: "+powerOfFour);
        System.out.println("After toggling 3rd bit: "+(n^(1<<2)));
        for(int i=1;i<=50;i++) {
            int value=n*i;
            if(value%48==0) { System.out.println("Stopped at "+value); break; }
            if(value%6==0) continue;
            System.out.println(n+" x "+i+" = "+value);
        }
    }
}
