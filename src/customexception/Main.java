package customexception;

public class Main {
    public static void main(String[] args) {
        try {
            int age=23;
            if(age<18)
            throw new CustomException("Something went wrong!");
            else
                System.out.println("You can vote");
        } catch (CustomException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
    }
}
