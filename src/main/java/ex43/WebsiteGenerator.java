/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

package ex43;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class WebsiteGenerator {
    public static void main(String[] args) throws FileNotFoundException {

        String sitename, author, JSInput, CSSInput;
        boolean success = false;

        System.out.print("Site name: ");
        Scanner sc1 = new Scanner(System.in);
        sitename = sc1.next();

        System.out.print("\nAuthor: ");
        Scanner sc2 = new Scanner(System.in);
        author = sc2.next();

        System.out.print("\nDo you want a folder for JavaScript? ");
        Scanner sc3 = new Scanner(System.in);
        JSInput = sc3.next();


        System.out.print("\nDo you want a folder for CSS? ");
        Scanner sc4 = new Scanner(System.in);
        CSSInput = sc4.next();

        String dir = "website";
        File directory = new File(dir);
        success = directory.mkdirs();

        String indexpath = "C:" + File.separator + "website" + File.separator + sitename + File.separator +"index.html";
        File indexfile = new File(indexpath);
        String htmldata = "<title>" + sitename + "<title>\n" + "<meta>" + author + "<meta>";
        PrintWriter writer = new PrintWriter(indexfile);

        if (sc3.equals("y") && sc4.equals("y")) {
            String indexpath2 =  "C:" + File.separator + "website" + File.separator + sitename + File.separator +"js";
            File JSFile = new File(indexpath2);
            String indexpath3 =  "C:" + File.separator + "website" + File.separator + sitename + File.separator +"css";
            File csFile = new File(indexpath3);
            PrintWriter writer2 = new PrintWriter(JSFile);
            PrintWriter writer3 = new PrintWriter(csFile);
        }
        else if (sc3.equals("n") && sc4.equals("y")){
            String indexpath3 =  "C:" + File.separator + "website" + File.separator + sitename + File.separator +"css";
            File csFile = new File(indexpath3);
            PrintWriter writer3 = new PrintWriter(csFile);

        }
        else if (sc3.equals("y") && sc4.equals("n")){
            String indexpath2 =  "C:" + File.separator + "website" + File.separator + sitename + File.separator +"js";
            File JSFile = new File(indexpath2);
            PrintWriter writer2 = new PrintWriter(JSFile);
        }
        else {
            System.out.printf("Sorry, error");
        }
    }
}





