class Q28 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int key=5;
        boolean found=false;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(a[i][j]==key) {
                    System.out.println("Found at row "+i+", column "+j);
                    found=true;
                }
        if(!found) System.out.println("Not found");
    }
}
