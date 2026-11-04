class Q26 {
    static String matrixType="2x2 Matrix";
    void calculate() {
        int[][] a={{1,2},{3,4}}, b={{5,6},{7,8}};
        int[][] sum=new int[2][2], diff=new int[2][2];
        for(int i=0;i<2;i++) for(int j=0;j<2;j++){
            sum[i][j]=a[i][j]+b[i][j];
            diff[i][j]=a[i][j]-b[i][j];
        }
        System.out.println(matrixType+" Addition:");
        for(int[] row:sum){ for(int n:row) System.out.print(n+" "); System.out.println(); }
        System.out.println("Subtraction:");
        for(int[] row:diff){ for(int n:row) System.out.print(n+" "); System.out.println(); }
    }
    public static void main(String[] args) { new Q26().calculate(); }
}
