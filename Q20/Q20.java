import java.util.Scanner;
class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter password: ");
            password=sc.nextLine();
        } while(!password.equals("java123"));
        System.out.println("Access granted");
    }
}
