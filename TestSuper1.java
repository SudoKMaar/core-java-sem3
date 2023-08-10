class A2 {
    String color = "blue";
}

class B2 extends A2 {
    String color = "red";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

class TestSuper1 {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.printColor();

    }
}
