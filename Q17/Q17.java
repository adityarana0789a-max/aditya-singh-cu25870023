import java.util.Scanner;
class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Integer.rotateLeft(n,2);
        System.out.println("Result = " + result);
        System.out.println("Binary = " + Integer.toBinaryString(result));
    }
}
