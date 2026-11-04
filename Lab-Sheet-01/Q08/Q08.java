public class Q08 {
    public static void main(String[] args) {
        char ch = 'e';
        if ("aeiouAEIOU".indexOf(ch) >= 0)
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}
