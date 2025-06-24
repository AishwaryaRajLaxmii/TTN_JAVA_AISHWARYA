package employeedetail;

public class Main {
    public static void main(String args[]){
        Employee emp1 = new Employee();
        System.out.println("Default Constructor:");
        System.out.println(emp1);

        emp1.setFirstname("Aishu");
        emp1.setLastname("Chauhan");
        emp1.setAge(28);
        emp1.setDesignation("Java Developer");
        System.out.println("After using setters:");
        System.out.println(emp1);

        // Using parameterized constructor
        Employee emp2 = new Employee("Aishwarya", "Raj Laxmi", 23, "Software Developer");
        System.out.println("Parameterized Constructor:");
        System.out.println(emp2);

    }
}
