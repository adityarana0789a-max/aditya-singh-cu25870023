class Q30 {
    public static void main(String[] args) {
        int[][] a={{0,0,3},{0,0,0},{4,0,0}};
        int zero=0, nonzero=0;
        for(int[] row:a) for(int n:row) {
            if(n==0) zero++; else nonzero++;
        }
        System.out.println("Zero elements = "+zero);
        System.out.println("Non-zero elements = "+nonzero);
        System.out.println(zero>nonzero?"Sparse matrix":"Not a sparse matrix");
    }
}
