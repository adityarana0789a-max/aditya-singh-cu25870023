import java.util.Scanner;
class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt(), low=sc.nextInt(), high=sc.nextInt();
        boolean leap=(year%400==0)||(year%4==0 && year%100!=0);
        if(leap && year>=low && year<=high) System.out.println("Leap year within range");
        else System.out.println("Condition not satisfied");
    }
}
