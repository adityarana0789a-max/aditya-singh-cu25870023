class Q25 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int main=0, secondary=0, n=a.length;
        for(int i=0;i<n;i++) {
            main+=a[i][i];
            secondary+=a[i][n-1-i];
        }
        System.out.println("Main diagonal sum = "+main);
        System.out.println("Secondary diagonal sum = "+secondary);
    }
}
