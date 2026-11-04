class Q24 {
    public static void main(String[] args) {
        int[] a={1,2,2,3,1,4};
        for(int i=0;i<a.length;i++) {
            boolean duplicate=false;
            for(int j=0;j<i;j++) if(a[i]==a[j]) duplicate=true;
            if(!duplicate) System.out.print(a[i]+" ");
        }
    }
}
