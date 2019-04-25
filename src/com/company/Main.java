package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        ArrayList< Movies> CENIMA = new ArrayList<Movies>();
        Scanner scan =new  Scanner(System.in);
        Random sugesNum = new Random();
        String more = "yes";
        System.out.println("Do you have movie in mind?");
        more = scan.nextLine();

        while (!more.equalsIgnoreCase("NO")) {
      //      more = scan.nextLine();
            Movies movie1 = new Movies();
            System.out.println("enter title");
            movie1.setTitle(scan.nextLine());
            System.out.println("enter actore");
            movie1.setActor(scan.nextLine());
            System.out.println("enter year");
            movie1.setYear(scan.nextInt());
            CENIMA.add(movie1);
            System.out.println("more movies?");
            scan.nextLine();
            more = scan.nextLine();

        }
        // enhanced for loop.
        for (Movies mvi: CENIMA){
            System.out.println(mvi.display());
//          System.out.println(mvi.getYear());

            System.out.println("your suggestiond movie is");
        }
        int m = sugesNum.nextInt(CENIMA.size());
        System.out.println(CENIMA.get(m).getTitle());
    }
}
