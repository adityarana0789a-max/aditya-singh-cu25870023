class Q17 {
    String name="Riya"; int marks=82;
    static int passingMarks=40;
    void grade() {
        String result=marks>=90?"A":marks>=75?"B":marks>=60?"C":marks>=passingMarks?"D":"F";
        System.out.println(name+" grade = "+result);
    }
    public static void main(String[] args) { new Q17().grade(); }
}
