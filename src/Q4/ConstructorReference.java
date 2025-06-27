package Q4;
@FunctionalInterface
interface ConstructorRef{
    Message create(String str);
}

class Message{
    String str;
    Message(String str){
        this.str=str;
        System.out.println("Hello "+str);
    }
}




public class ConstructorReference {
    public static void main(String[] args) {
        ConstructorRef c=Message::new;
        c.create("To Aishwarya");
    }
}
;