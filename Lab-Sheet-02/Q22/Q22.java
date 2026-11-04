import java.util.Scanner;
class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), reverse=0;
        while(n!=0) { reverse=reverse*10+n%10; n/=10; }
        System.out.println("Reverse = " + reverse);
    }
}
