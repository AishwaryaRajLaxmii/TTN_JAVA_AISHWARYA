package Q4;

import java.util.stream.*;
import java.util.*;

public class UnModifiableList1 {
    public static void main(String[] args) {
        List<String> list= Stream.of("java","python","c++").collect(Collectors.toUnmodifiableList());
        System.out.println(list);

//        list.add("Ruby");
    }
}

