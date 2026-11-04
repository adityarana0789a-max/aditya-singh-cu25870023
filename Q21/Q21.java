import java.util.Scanner;
class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), i=1;
        System.out.print("Factors: ");
        do {
            if(n%i==0) System.out.print(i+" ");
            i++;
        } while(i<=n);
    }
}
