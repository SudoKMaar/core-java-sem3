class Add {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Add.add(31, 21));
        System.out.println(Add.add(21, 31, 44));
    }
}