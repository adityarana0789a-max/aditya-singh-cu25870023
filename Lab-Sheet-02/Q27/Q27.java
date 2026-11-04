import java.util.Scanner;
class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char grade=Character.toUpperCase(sc.next().charAt(0));
        switch(grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Below average"); break;
            case 'E': case 'F': System.out.println("Needs improvement"); break;
            default: System.out.println("Invalid grade");
        }
    }
}
