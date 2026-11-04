import java.util.Scanner;
class Q09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(), b=sc.nextLine();
        int i=0, result=0;
        while(i<a.length() && i<b.length()) {
            if(a.charAt(i)<b.charAt(i)){ result=-1; break; }
            if(a.charAt(i)>b.charAt(i)){ result=1; break; }
            i++;
        }
        if(result==0) result=Integer.compare(a.length(),b.length());
        if(result<0) System.out.println(a+" comes before "+b);
        else if(result>0) System.out.println(a+" comes after "+b);
        else System.out.println("Both strings are equal");
    }
}
