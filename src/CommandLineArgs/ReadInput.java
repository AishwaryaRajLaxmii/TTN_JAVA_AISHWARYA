package CommandLineArgs;

import java.util.Scanner;

public class ReadInput {
    public static String readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input (type 'XDONE' to stop):");
        StringBuilder str=new StringBuilder();
        String line;

        while(true){
            line=sc.nextLine();
            if(line.equals("XDONE"))
            {
                break;
            }
            str.append(line).append("\n");

        }
        return str.toString();
    }

}
