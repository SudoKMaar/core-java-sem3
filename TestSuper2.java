class A{
    void eat(){System.out.println("eating...");}}
class B extends A{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();}}
class TestSuper2{
    public static void main(String[] args){
        B obj=new B();
        obj.work();
    }}