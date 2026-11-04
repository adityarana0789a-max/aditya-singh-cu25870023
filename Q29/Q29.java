import java.util.Arrays;
class Q29 {
    public static void main(String[] args) {
        int[][] a={{5,2,4},{9,1},{8,3,7,6}};
        for(int[] row:a) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
        }
    }
}
