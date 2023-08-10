class Constructor3 {
    int id;
    String name;
    int age;

    Constructor3(int i, String n) {
        id = i;
        name = n;
    }

    Constructor3(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Constructor3 s1 = new Constructor3(22, "ABC");
        Constructor3 s2 = new Constructor3(33, "XYZ", 25);
        s1.display();
        s2.display();
    }
}
