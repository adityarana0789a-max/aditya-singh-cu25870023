class Q20 {
    public static void main(String[] args) {
        int[][] marks={{80,75},{90,85,88},{70,60,65,72}};
        for(int i=0;i<marks.length;i++) {
            System.out.print("Student "+(i+1)+": ");
            for(int m:marks[i]) System.out.print(m+" ");
            System.out.println();
        }
    }
}
