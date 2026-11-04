class Q25 {
    public static void main(String[] args) {
        int[][] marks={{80,70,90},{60,75,85}};
        int sum=0,count=0;
        for(int[] row:marks) for(int m:row) { sum+=m; count++; }
        System.out.printf("Average marks = %.2f%n",(double)sum/count);
    }
}
