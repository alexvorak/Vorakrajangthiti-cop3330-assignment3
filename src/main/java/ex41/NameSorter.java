/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

package ex41;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.util.Scanner;


public class NameSorter {
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        ArrayList<String> lines = new ArrayList<>();

        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\AlexV\\Documents\\exercise41_input.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }
            Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("C:\\Users\\AlexV\\Documents\\exercise41_output.txt"));
            ObjectCounterMethod();
            writer.write(ObjectCounterMethod());
            for (String line : lines)
            {

                writer.write(line);

                writer.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    private static String ObjectCounterMethod() {

        int count = 0;
        String x = new String();
        String str;
        try {
            File file = new File("C:\\Users\\AlexV\\Documents\\exercise41_input.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            String scount = Integer.toString(count);
            x = "Total of " + scount + " names\n" + "-----------------\n";
            sc.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        return x;
    }
}

