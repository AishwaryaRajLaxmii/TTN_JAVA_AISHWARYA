package Q3;


public class Main {
    public static void main(String[] args) {
        Student s1=new Student(101,"Aishwarya","12th");
        Student s2=new Student(101,"Aishwarya","12th");
        Student s3=new Student(102,"Tanu","11th");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

    }
}
