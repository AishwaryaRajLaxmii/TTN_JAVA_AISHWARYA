package filehandle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ans="";

        try(BufferedWriter writer=new BufferedWriter(new FileWriter("./src/filehandle/users.txt",true))){
            do{
                // Ask user for details
                System.out.print("Enter First Name: ");
                String firstName = input.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = input.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(input.nextLine());

                System.out.print("Enter Phone Number: ");
                String phone = input.nextLine();

                User user=new User(firstName,lastName,age,phone);
                writer.write(user.toString());
                writer.newLine();
                writer.flush();

                System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
                ans=input.nextLine();
            }while(!ans.equalsIgnoreCase("quit"));
            System.out.println("Exiting... All users saved to file.");

        }catch (IOException e){

        }

    }
}
