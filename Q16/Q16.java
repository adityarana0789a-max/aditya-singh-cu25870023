class Q16 {
    public static void main(String[] args) {
        int[][][] a={{{1,-2},{3,-4}},{{-5,6},{0,8}}};
        int positive=0, negative=0;
        for(int[][] layer:a) for(int[] row:layer) for(int n:row) {
            if(n>0) positive++;
            else if(n<0) negative++;
        }
        System.out.println("Positive = "+positive);
        System.out.println("Negative = "+negative);
    }
}
