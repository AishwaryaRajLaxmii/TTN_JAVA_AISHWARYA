package Q2;

public class Employee implements Comparable<Employee>{
    Double age;
    Double salary;
    String name;

    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    sorting by name (default)
    @Override
    public int compareTo(Employee obj){
        return this.name.compareTo(obj.name);
    }

    public String toString(){
        return name + " - Age: " + age + " - Salary: " + salary;
    }
}
