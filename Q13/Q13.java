import java.util.Scanner;
class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String type=Character.isLetter(ch)?("aeiouAEIOU".indexOf(ch)>=0?"Vowel":"Consonant"):
                    Character.isDigit(ch)?"Digit":"Special symbol";
        System.out.println(type);
    }
}
