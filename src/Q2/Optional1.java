package Q2;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> name=Optional.of("Aishwarya");
        System.out.println(name);
        name.stream().forEach(System.out::println);
    }
}
