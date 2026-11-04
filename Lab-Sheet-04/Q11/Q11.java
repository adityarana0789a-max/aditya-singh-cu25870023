class Q11 {
    static int operationsCount=0;
    int add(int a,int b){ operationsCount++; return a+b; }
    int subtract(int a,int b){ operationsCount++; return a-b; }
    int multiply(int a,int b){ operationsCount++; return a*b; }
    double divide(int a,int b){ operationsCount++; return (double)a/b; }
    public static void main(String[] args) {
        Q11 c=new Q11();
        System.out.println(c.add(8,2));
        System.out.println(c.subtract(8,2));
        System.out.println(c.multiply(8,2));
        System.out.println(c.divide(8,2));
        System.out.println("Operations = "+operationsCount);
    }
}
