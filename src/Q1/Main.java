package Q1;
@FunctionalInterface

interface CheckGreater {
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface Incrementer {
    int increment(int num);
}

@FunctionalInterface
interface StringConcatenator {
    String concat(String s1, String s2);
}

@FunctionalInterface
interface ToUpper {
    String convert(String s);
}


public class Main {
    public static void main(String[] args) {
        CheckGreater c=(a,b)->a>b;
        System.out.println("Greater: "+c.isGreater(10,20));

        Incrementer i=(num)->num+1;
        System.out.println("Increment by 1:(10+1) "+i.increment(10));

        StringConcatenator s=(s1,s2)->s1+s2;
        System.out.println("After Concatanation: "+s.concat("Aishwarya"," Raj"));

        ToUpper t=(str)->str.toUpperCase();
        System.out.println("Upper: "+t.convert("aishwarya"));


    }
}

