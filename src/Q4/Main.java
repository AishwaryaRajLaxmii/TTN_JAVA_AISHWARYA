package Q4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Map<Employee,Double> map=new HashMap<>();
        map.put(new Employee("Alice", 30, "Developer"), 60000.0);
        map.put(new Employee("Alice", 30, "Developer"), 60000.0);
        map.put(new Employee("Bob", 35, "Manager"), 75000.0);
        map.put(new Employee("Charlie", 28, "Tester"), 50000.0);

        for(Map.Entry<Employee, Double> entry:map.entrySet()){
            System.out.println(entry.getKey() + " Salary: " + entry.getValue());
        }
    }
}
