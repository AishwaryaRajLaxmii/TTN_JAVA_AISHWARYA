package Q1;
import java.util.function.*;
import java.util.function.Function;


public class FunctionalInterFace {
    public static void main(String[] args) {
        Consumer<String> consumer=(name)-> System.out.println("Hello "+name);
        consumer.accept("Aishwarya");
        consumer.accept("Raj");
        consumer.accept("Laxmi");
        Supplier<Double> supplier=()->Math.random();
        System.out.println(supplier.get());

        Predicate<Integer> isEven=num->num%2==0;
        System.out.println(isEven.test(10));


        Function<String,Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java"));

    }
}

