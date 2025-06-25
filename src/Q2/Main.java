package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Aishwarya Raj", 30.0, 50000.0));
        list.add(new Employee("Chhavi Singh", 28.0, 60000.0));
        list.add(new Employee("Binita", 35.0, 45000.0));

//        default sorting by name
        Collections.sort(list);

        System.out.println("Sorted by name (default):");
        for (Employee e : list) {
            System.out.println(e);
        }
//      sorting by salary
        Collections.sort(list, new SalaryComparator());
        System.out.println("Sorted by salary:");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
