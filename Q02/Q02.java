import java.util.Scanner;
class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double amount = p * Math.pow(1 + r / 100, t);
        System.out.printf("Compound Interest = %.2f%n", amount - p);
    }
}
