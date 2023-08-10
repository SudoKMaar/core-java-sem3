class Teststringcomparison2 {
    public static void main(String[] args) {
        String s1 = "Amit";
        String s2 = "Amit";
        String s3 = new String("Amit");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}