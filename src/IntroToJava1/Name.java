package IntroToJava1;

public class Name {

    static String firstName;
    static String lastName;
    static int age=23;

   static{
       firstName="Aishwarya";
       System.out.println("My first name is : "+firstName);
   }

   static void printLastName(){
       lastName="Raj";
       System.out.println("My last name is : "+lastName);
   }

}
