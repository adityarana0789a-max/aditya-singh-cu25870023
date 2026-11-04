import java.util.Scanner;
class Q08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        if(a>0 && b>0 && c>0 && a+b+c==180)
            System.out.println("Valid triangle");
        else System.out.println("Invalid triangle");
    }
}
