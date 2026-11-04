class Q06 {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20, 25};
        int[] b = new int[a.length];
        for (int i=0; i<a.length; i++) b[i] = a[i];
        for (int n : b) System.out.print(n + " ");
    }
}
