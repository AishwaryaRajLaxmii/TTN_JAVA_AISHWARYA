package countoccurences;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer file path:");
        String filename=sc.nextLine();

        System.out.println("Enter word to find occurence:");
        String word=sc.nextLine();

        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\W+");

                for(String s:words){
                    if(s.equalsIgnoreCase(word)){
                        count++;
                    }
                }
            }
            System.out.println("The word "+ word + " occurs " + count + " times.");

        }catch (IOException e){
            e.printStackTrace();;
        }
    }
}
