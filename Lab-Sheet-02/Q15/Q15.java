import java.util.Scanner;
class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), count=0, value=n;
        while(value!=0) { count+=value&1; value>>>=1; }
        System.out.println("Set bits = " + count);
    }
}
