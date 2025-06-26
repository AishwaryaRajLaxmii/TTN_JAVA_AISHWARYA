package Q4;
class Message{
    String str;
    Message(String str){
        this.str=str;
        System.out.println("Hello "+str);
    }
}
@FunctionalInterface
interface ConstructorRef{
    Message create(String str);
}



public class ConstructorReference {
    public static void main(String[] args) {
        ConstructorRef c=Message::new;
        Message m=c.create("To Aishwarya");
    }
}
;