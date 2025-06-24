package circlecalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        double radius;
        do {

            System.out.println("\n******* Menu *******");
            System.out.println("1. Area of Circle");
            System.out.println("2. Circumference of Circle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    radius = sc.nextDouble();
                    System.out.println("Area :" + Circle.getArea(radius));
                    break;


                case 2:
                    System.out.print("Enter radius: ");
                    radius = sc.nextDouble();
                    System.out.println("Circumference : " + Circle.getCircumference(radius));
                    break;


                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid entry");


            }
        }
            while (choice != 3) ;

    }
}
