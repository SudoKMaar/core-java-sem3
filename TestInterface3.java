interface Printable2{
    void print();}
interface Showable2{
    void show();}
class TestInterface3 implements Printable2, Showable2{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}
    public static void main(String[] args){
        TestInterface3 obj = new TestInterface3();
        obj.print();
        obj.show();
    }}
