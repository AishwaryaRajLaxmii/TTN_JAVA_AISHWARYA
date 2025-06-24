package enums;

//Q1. Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
enum House{
    SMALL(50000),
    MEDIUM(100000),
    LARGE(200000);
    private final int price;

    House(int price) {
        this.price=price;
    }

    public int getPrice(){
        return price;
    }
}


public class EnumExample {
    public static void main(String[] args) {
        for(House h:House.values()){
            System.out.println(h + " costs " + h.getPrice());
        }
    }
}
