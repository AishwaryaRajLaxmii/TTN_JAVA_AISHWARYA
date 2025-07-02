package Q7;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SequencedMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        System.out.println("Original Map:");
        System.out.println(map);
        System.out.println();

        System.out.println("First entry");
        System.out.println(map.firstEntry());

        System.out.println("Last Entry");
        System.out.println(map.lastEntry());

        System.out.println("Poll First Entry");
        System.out.println(map.pollFirstEntry());
        System.out.println(map);

        System.out.println("Poll Last Entry");
        System.out.println(map.pollLastEntry());
        System.out.println(map);

        System.out.println("Put First");
        map.putFirst(1,"one");
        System.out.println(map);

        System.out.println("Push Last");
        map.putLast(7,"seven");
        System.out.println(map);

        System.out.println("Reversed ");
        System.out.println(map.reversed());
    }
}
