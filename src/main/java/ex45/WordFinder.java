/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

package ex45;

import java.io.*;
import java.util.Scanner;


public class WordFinder {
    public static void main(String[] args)
    {
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\AlexV\\Documents\\exercise45_input.txt"));
            String line = reader.readLine();
            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll("utilize","use");
            System.out.print("Write the new name for the output file: ");
            Scanner sc = new Scanner(System.in);
            String NewName = sc.next();
            writer = new FileWriter("C:\\Users\\AlexV\\Documents\\" + File.separator + NewName + ".txt");
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
