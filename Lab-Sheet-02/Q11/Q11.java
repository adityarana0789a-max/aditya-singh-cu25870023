import java.util.Scanner;
class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt(), practical=sc.nextInt(), overall=sc.nextInt();
        if((theory>=40 && practical>=50) || overall>=50)
            System.out.println("Pass");
        else System.out.println("Fail");
    }
}
