import java.util.Random;
class Q29 {
    public static void main(String[] args) {
        Random random=new Random(1);
        int n;
        do {
            n=random.nextInt(100)+1;
            System.out.println(n);
            if(n%7==0 && n%13==0) break;
        } while(true);
        System.out.println("Found: "+n);
    }
}
