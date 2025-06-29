package Q5;

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aishwarya Raj laxmi", 4000L, "delhi"),
                new Employee("Amit Kumar Singh", 3000L, "delhi"),
                new Employee("Ravi Kumar Sharma", 7000L, "delhi"),
                new Employee("Tanu Singh Chauhan", 3500L, "mumbai"),
                new Employee("Amit kumar Roy", 4000L, "delhi")
        );

        List<Employee> filteredList=employees.stream().filter(e->e.salary<5000 && e.city.equalsIgnoreCase("delhi")).collect(Collectors.toList());
        Set<String> uniqueFirstNames = new HashSet<>();

        for (Employee emp : filteredList) {
            String fullName = emp.fullName;
            String firstName = fullName.split(" ")[0];
            uniqueFirstNames.add(firstName);
        }

        System.out.println("Unique first names: " + uniqueFirstNames);


    }
}
