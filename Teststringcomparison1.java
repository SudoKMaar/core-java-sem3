class Teststringcomparison1 {
    public static void main(String[] args) {
        String s1 = "Amit";
        String s2 = "Amit";
        String s3 = new String("Amit");
        String s4 = "Rahul";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
