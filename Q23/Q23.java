import java.util.Scanner;
class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), temp=n, reverse=0;
        while(temp>0) { reverse=reverse*10+temp%10; temp/=10; }
        System.out.println(n==reverse?"Palindrome":"Not palindrome");
    }
}
