package Q2;
interface ArithMaticOperation{
    int apply(int a,int b);
}

class Calculate{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }

    public static int multiply(int a,int b){
        return a*b;
    }


}
public class MethodReference {
    public static void main(String[] args) {
        Calculate c1=new Calculate();
        ArithMaticOperation add=c1::add;
        ArithMaticOperation sub=c1::subtract;;
        ArithMaticOperation multiply=Calculate::multiply;
        System.out.println("Add: "+add.apply(5,3));
        System.out.println("Add: "+sub.apply(5,3));
        System.out.println("Add: "+multiply.apply(5,3));

    }
}
