package employeedetail;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    public Employee(){
        this.firstname = "not known";
        this.lastname = "not known";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    // 2️⃣ Parameterized constructor
    public Employee(String firstname, String lastname, int age, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }
    // setters to update values
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee: " + firstname + " " + lastname + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }


}
