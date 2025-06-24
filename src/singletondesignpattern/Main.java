package singletondesignpattern;

public class Main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        System.out.println("Are both objects same? " + (obj1 == obj2));

    }
}
