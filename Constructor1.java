class Constructor1 {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Constructor1 s1 = new Constructor1();
        Constructor1 s2 = new Constructor1();
        s1.display();
        s2.display();
    }
}