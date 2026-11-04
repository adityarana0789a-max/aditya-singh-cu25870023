class Q27 {
    static int totalReversals=0;
    String reverse(String text) {
        totalReversals++;
        String result="";
        for(int i=text.length()-1;i>=0;i--) result+=text.charAt(i);
        return result;
    }
    public static void main(String[] args) {
        Q27 r=new Q27();
        System.out.println(r.reverse("JAVA"));
        System.out.println("Reversals = "+totalReversals);
    }
}
