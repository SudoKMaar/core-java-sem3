class Constructor4 {
    int id;
    String name;

    Constructor4(int i, String n) {
        id = i;
        name = n;
    }

    Constructor4() {
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Constructor4 s1 = new Constructor4(111, "Karan");
        Constructor4 s2 = new Constructor4();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}