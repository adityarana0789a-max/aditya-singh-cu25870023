class Q09 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<a.length; i++) {
            int sum = 0;
            for (int n : a[i]) sum += n;
            System.out.println("Row " + (i+1) + " sum = " + sum);
        }
    }
}
