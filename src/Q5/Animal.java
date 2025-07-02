package Q5;

sealed public  class Animal permits Cat,Dog,Rabbit{
    void animal(){
        System.out.println("I am Animal...");
    }
}
