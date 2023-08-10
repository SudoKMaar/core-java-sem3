class Constructor2 {
    int id;
    String name;

    Constructor2(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Constructor2 s1 = new Constructor2(22, "ABC");
        Constructor2 s2 = new Constructor2(33, "XYZ");
        s1.display();
        s2.display();
    }
}