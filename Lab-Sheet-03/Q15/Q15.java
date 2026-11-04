class Q15 {
    public static void main(String[] args) {
        int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};
        int sum=0;
        for(int[][] layer:a) for(int[] row:layer) for(int n:row) sum+=n;
        System.out.println("Sum = "+sum);
    }
}
