class Q04 {
    int empId=101; double salary=25000;
    static String companyName="ABC Ltd";
    void display() {
        int id=empId; double pay=salary;
        System.out.println(companyName);
        System.out.println("ID = "+id+", Salary = "+pay);
    }
    public static void main(String[] args) { new Q04().display(); }
}
