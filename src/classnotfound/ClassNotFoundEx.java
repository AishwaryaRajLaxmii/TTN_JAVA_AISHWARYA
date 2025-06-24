package classnotfound;

public class ClassNotFoundEx {
    public static void main(String[] args) {
        try {
            Class.forName("FakeClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
