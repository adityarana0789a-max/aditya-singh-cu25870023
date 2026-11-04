class Q17 {
    public static void main(String[] args) {
        int[][][] a={{{4,9},{2,7}},{{12,5},{3,8}}};
        int max=a[0][0][0];
        for(int[][] layer:a) for(int[] row:layer) for(int n:row)
            if(n>max) max=n;
        System.out.println("Maximum = "+max);
    }
}
