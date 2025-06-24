package filehandle;

 class User {
    private String firstName;
    private String lastName;
    private int age;
    private int phone;

     public User(String firstName, String lastName, int age, String phoneNumber) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.phone = phone;
     }
 @Override
     public String toString(){
     return firstName + "," + lastName + "," + age + "," + phone;
     }

 }
