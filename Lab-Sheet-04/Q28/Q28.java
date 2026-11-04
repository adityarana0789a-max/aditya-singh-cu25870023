class Q28 {
    static String language="English";
    int countWords(String sentence) {
        String s=sentence.trim();
        if(s.isEmpty()) return 0;
        String[] words=s.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Q28 w=new Q28();
        System.out.println("Language = "+language);
        System.out.println("Words = "+w.countWords("Java is easy to learn"));
    }
}
