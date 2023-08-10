class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("running...");
    }
}

class BabyDog extends Dog {
    void sleep() {
        System.out.println("sleeping...");
    }
}

class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.sleep();
        d.run();
        d.eat();
    }
}