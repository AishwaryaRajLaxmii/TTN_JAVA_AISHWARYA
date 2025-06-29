package Q3;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
    List<Integer> numbers= Arrays.asList(33, 6, 9, 2, 1, 5, 10);
    int sum=numbers.stream().filter(n->n>5).reduce(0,(a,b)->a+b);
    System.out.println("Sum of numbers > 5: "+sum);
    }
}
