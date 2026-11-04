class Q04 {
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 23};
        int max = a[0];
        for (int n : a) if (n > max) max = n;
        System.out.println("Maximum = " + max);
    }
}
