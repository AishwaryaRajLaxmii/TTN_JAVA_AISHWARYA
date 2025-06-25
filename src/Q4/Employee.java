package Q4;

import java.util.Objects;

public class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return age == e.age &&
                Objects.equals(name, e.name) &&
                Objects.equals(designation, e.designation);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age,designation);
    }

    public String toString(){
        return name + designation  +  age  ;

    }
}


