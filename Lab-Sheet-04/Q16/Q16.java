class Q16 {
    int a=5,b=5,c=5;
    static String type="Triangle";
    void check() {
        boolean valid=a+b>c && a+c>b && b+c>a;
        String kind=(a==b && b==c)?"Equilateral":
                    (a==b || b==c || a==c)?"Isosceles":"Scalene";
        System.out.println(type+" valid = "+valid);
        if(valid) System.out.println("Type = "+kind);
    }
    public static void main(String[] args) { new Q16().check(); }
}
