class Q30 {
    int booksAvailable=10;
    static String libraryName="City Library";
    void issue(int n) {
        int remaining=booksAvailable-n;
        if(n>0 && n<=booksAvailable) booksAvailable=remaining;
        System.out.println("After issue = "+booksAvailable);
    }
    void returnBooks(int n) {
        int updated=booksAvailable+n;
        if(n>0) booksAvailable=updated;
        System.out.println("After return = "+booksAvailable);
    }
    public static void main(String[] args) {
        Q30 l=new Q30();
        System.out.println(libraryName);
        l.issue(3); l.returnBooks(2);
    }
}
