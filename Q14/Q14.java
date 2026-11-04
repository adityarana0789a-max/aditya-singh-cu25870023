class Q14 {
    public static void main(String[] args) {
        int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int i=0;i<2;i++) {
            System.out.println("Layer "+(i+1));
            for(int j=0;j<2;j++) {
                for(int k=0;k<2;k++) System.out.print(a[i][j][k]+" ");
                System.out.println();
            }
        }
    }
}
