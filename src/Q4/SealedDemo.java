package Q4;

public sealed class SealedDemo permits Test1,Test2{
    void printData(){
        System.out.println("Hello Aishwarya, I am a Sealed Class...");
    }
}
