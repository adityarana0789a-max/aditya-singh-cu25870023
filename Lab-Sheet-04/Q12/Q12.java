class Q12 {
    int marks1=80, marks2=75, marks3=85;
    static String universityName="ABC University";
    void average() {
        double avg=(marks1+marks2+marks3)/3.0;
        System.out.println(universityName);
        System.out.println("Average = "+avg);
    }
    public static void main(String[] args) { new Q12().average(); }
}
