package Q6;

import java.util.ArrayList;
import java.util.List;

public class SequencedList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println("Original List :");
        System.out.println(list);

        System.out.println("Adding First: ");
        list.addFirst(10);
        System.out.println(list);

        System.out.println("Adding Last: ");
        list.addLast(10);
        System.out.println(list);

        System.out.println("Remove First: ");
        list.removeFirst();
        System.out.println(list);

        System.out.println("Remove Last: ");
        list.removeLast();
        System.out.println(list);

        System.out.println("Get First: ");
        System.out.println(list.getFirst());

        System.out.println("Get Last: ");
        System.out.println(list.getLast());

        System.out.println("Reversed: ");
        System.out.println(list.reversed());


    }
}
