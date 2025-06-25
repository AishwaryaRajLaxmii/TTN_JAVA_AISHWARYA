package Q3;

public class Main {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack(10);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Minimum: " + s.getMin());
        s.pop(); // removes 7
        System.out.println("Minimum now: " + s.getMin());

        s.pop(); // removes 3
        System.out.println("Minimum now: " + s.getMin());

        s.pop(); // removes 5
        System.out.println("Minimum now: " + s.getMin());
    }
}
