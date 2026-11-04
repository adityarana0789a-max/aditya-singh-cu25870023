public class Q09 {
    public static void main(String[] args) {
        int m1 = 75, m2 = 68, m3 = 80;
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
