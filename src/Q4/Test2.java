package Q4;

non-sealed class Test2 extends SealedDemo{
    void test2(){
        System.out.println("Hello Test2");
    }
}

class Test3 extends Test2{
    void test3(){
        System.out.println("Hello Test3");
    }
}
