class Q14 {
    String name="Aman"; int age=20;
    static String country="India";
    void check() {
        int minimumAge=18;
        System.out.println(name+" from "+country);
        System.out.println(age>=minimumAge?"Eligible to vote":"Not eligible");
    }
    public static void main(String[] args) { new Q14().check(); }
}
