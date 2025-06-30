package Q3;

import java.util.*;

public class CreateList {
    public static void main(String[] args) {
        List<String> names= List.of("Aishwarya","Raj","Laxmi");
        Set<Integer> nums=Set.of(1,2,3,4,5);
        Map<String,Integer> map=Map.of("a",1,"b",2);

        System.out.println(names);
        System.out.println(nums);
        System.out.println(map);
    }
}
