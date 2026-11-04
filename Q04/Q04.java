class Q04 {
    public static void main(String[] args) {
        int visitors=5;
        System.out.println("Initial visitors = " + visitors);
        System.out.println("Entering visitor (prefix) = " + (++visitors));
        System.out.println("Leaving visitor (postfix) = " + (visitors--));
        System.out.println("Final visitors = " + visitors);
    }
}
