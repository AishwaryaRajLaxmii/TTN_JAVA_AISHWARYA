package Q1;
import java.util.stream.*;

public class Stream1 {
    public static void main(String[] args) {
        Stream.iterate(1,x->x+1).limit(10).forEach(System.out::println);
    }
}
