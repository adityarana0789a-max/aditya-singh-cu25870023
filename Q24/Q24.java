class Q24 {
    public static void main(String[] args) {
        int[] a={12,5,30,8,17};
        int max=a[0], min=a[0];
        for(int n:a) { if(n>max) max=n; if(n<min) min=n; }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
