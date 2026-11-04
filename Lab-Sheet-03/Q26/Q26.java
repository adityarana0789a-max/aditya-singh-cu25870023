class Q26 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Upper triangular:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) System.out.print(j>=i?a[i][j]+" ":"0 ");
            System.out.println();
        }
        System.out.println("Lower triangular:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) System.out.print(j<=i?a[i][j]+" ":"0 ");
            System.out.println();
        }
    }
}
