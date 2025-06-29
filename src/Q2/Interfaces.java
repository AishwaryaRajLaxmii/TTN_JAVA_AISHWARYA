package Q2;

interface ITest{
    default void display(){
        System.out.println("Hello from Default");
    }

    static void show(){
        System.out.println("Hello from Static");
    }
}
class MyInterface implements ITest{

}
public class Interfaces {
    public static void main(String[] args) {
        MyInterface obj=new MyInterface();
        obj.display();
        ITest.show();

    }
}
