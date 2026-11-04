class Q01 {
    String name; int age;
    static int count = 0;
    Q01(String n, int a) { name=n; age=a; count++; }
    void display() { System.out.println(name+" "+age); }
    public static void main(String[] args) {
        String n1="Aman"; int a1=20;
        Q01 s1=new Q01(n1,a1), s2=new Q01("Riya",19);
        s1.display(); s2.display();
        System.out.println("Total students = "+count);
    }
}
