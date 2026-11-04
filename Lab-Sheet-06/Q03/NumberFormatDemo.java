public class NumberFormatDemo {
    public static void main(String[] args) {
        String value = "12A";
        try {
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: String is not a valid integer.");
        }
    }
}
