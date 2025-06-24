package exceptionhandling;

public class MultiCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int x = 10 / 0; // ArithmeticException
        }catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Index Exception: " + e);
        } catch (Exception e) {
            System.out.println("When no specific exception found: "+e);
        }
            finally {
            System.out.println("Finally block always executes.");
        }
    }
}
