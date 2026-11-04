import java.util.Scanner;
class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        a=a^b; b=a^b; a=a^b;
        System.out.println("After swap: a = "+a+", b = "+b);
    }
}
