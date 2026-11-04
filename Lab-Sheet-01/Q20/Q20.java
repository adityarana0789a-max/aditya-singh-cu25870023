public class Q20 {
    public static void main(String[] args) {
        String gender = "Male";
        int age = 22;
        boolean eligible = (gender.equalsIgnoreCase("Male") && age >= 21)
                        || (gender.equalsIgnoreCase("Female") && age >= 18);
        System.out.println(eligible ? "Eligible by the given age rule" : "Not eligible by the given age rule");
    }
}
