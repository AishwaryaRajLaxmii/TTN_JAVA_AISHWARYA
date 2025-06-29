package Q4;

import java.util.Optional;

public class OptionalClass1 {
    public static void main(String[] args) {
        String name="Aishwarya";
        Optional<String> optionalName= Optional.ofNullable(name);
        if(optionalName.isPresent()){
            System.out.println("Name is :"+optionalName.isPresent());
        }else{
            System.out.println("Name is not available");
        }
    }
}
