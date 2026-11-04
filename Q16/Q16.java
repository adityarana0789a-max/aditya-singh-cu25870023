public class Q16 {
    public static void main(String[] args) {
        double income = 650000, tax;
        if (income <= 250000) tax = 0;
        else if (income <= 500000) tax = (income - 250000) * 0.05;
        else if (income <= 1000000) tax = 12500 + (income - 500000) * 0.20;
        else tax = 112500 + (income - 1000000) * 0.30;
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}
