class Q29 {
    String name; double salary;
    Q29(String n,double s){ name=n; salary=s; }
    static String organization="ABC Company";
    public static void main(String[] args) {
        Q29 e1=new Q29("Aman",30000), e2=new Q29("Riya",35000);
        double difference=Math.abs(e1.salary-e2.salary);
        System.out.println(organization);
        System.out.println(e2.salary>e1.salary?e2.name+" earns more":e1.name+" earns more");
        System.out.println("Difference = "+difference);
    }
}
