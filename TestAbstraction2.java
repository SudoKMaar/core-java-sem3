abstract class Base3 {
    abstract void fun();
}

class Derived3 extends Base3 {
    void fun() {
        System.out.println("Derived Function");
    }

    public static void main(String[] args) {
        Base3 b = new Derived3();
        b.fun();
    }
}
