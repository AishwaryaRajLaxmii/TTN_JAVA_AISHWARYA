package Q6;

import java.util.List;
import java.util.LinkedHashSet;

public class SequencedSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(List.of(2,3,4,5,6,7,8,9,10));

        System.out.println("Original Set:");
        System.out.println(set);

        System.out.println("Adding to first:");
        set.addFirst(1);
        System.out.println(set);

        System.out.println("Adding to last:");
        set.addLast(11);
        System.out.println(set);

        System.out.println("Removing first:");
        set.removeFirst();
        System.out.println(set);

        System.out.println("Removing last:");
        set.removeLast();
        System.out.println(set);

        System.out.println("Get first value:");
        System.out.println(set.getFirst());

        System.out.println("Get last value:");
        System.out.println(set.getLast());

        System.out.println("Reverse List:");
        System.out.println(set.reversed());
    }
}
