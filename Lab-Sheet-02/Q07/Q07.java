class Q07 {
    public static void main(String[] args) {
        double[] rain={10,12,8,5,0,15,10};
        double total=0;
        for(double day:rain) total+=day;
        System.out.println("Total rainfall = " + total + " mm");
    }
}
