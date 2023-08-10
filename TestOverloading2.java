class Add2 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Add2.add(21, 31));
        System.out.println(Add2.add(21.44, 31.5));
    }
}
