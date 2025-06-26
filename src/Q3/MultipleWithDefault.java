package Q3;

interface A{
    public default void display(){
        System.out.println("This is A display");
    }
}

interface B{
    public default void display(){
        System.out.println("This is B display");
    }
}

class Test implements A,B{
    @Override
    public void display() {
        System.out.println("Inside Class Test");
        A.super.display();
    }
}

public class MultipleWithDefault {
    public static void main(String[] args) {
    Test t=new Test();
    t.display();;
    }
}
