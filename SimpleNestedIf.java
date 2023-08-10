class SimpleNestedIf {
    public static void main(String args[]) {
        int age = 25;
        int weight = 48;
        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible");
            } else {
                System.out.println("You must be above 50Kgs");
            }
        }
    }
}