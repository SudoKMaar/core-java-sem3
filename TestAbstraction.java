abstract class Base2 {
    Base2() {
        System.out.println("Base called");
    }

    abstract void run();
}

class Derived2 extends Base2 {
    Derived2() {
        System.out.println("Derived called");
    }

    void run() {
        System.out.println("Derived function called");
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Derived2 b = new Derived2();
        b.run();
    }
}