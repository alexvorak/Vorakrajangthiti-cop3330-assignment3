/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

package ex46;

import java.io.*;
import java.util.*;

import static ex46.StarCounter.toStars;


public class WordFrequencyFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\AlexV\\Documents\\exercise46_input.txt"));
        String temp = null;
        ArrayList<String> listofLines = new ArrayList<>();
        while ((temp = in.readLine()) != null)
        {
        listofLines.add(temp);
        }
        in.close();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < listofLines.size(); i++)
        {
            String[] temp2 = listofLines.get(i).split(" ");
            words.addAll(Arrays.asList(temp2));
        }
        int count =0;
        int count1 =0;
        int count2 =0;
        for (String word :words) {
            if (word.equals("badger")) {
                count++;
            } else if (word.equals("mushroom")) {
                count1++;
            } else if (word.equals("snake")) {
                count2++;
            }
        }
        System.out.println("badger: " + toStars(count));
        System.out.println("mushroom: " + toStars(count1));
        System.out.println("snake: " +toStars(count2));
    }

}

class StarCounter
{
    public static String toStars(int number)
    {
        StringBuilder temp2 = new StringBuilder();
        for (int i=0; i<number; i++)
        {
            temp2.append("*");
        }
        return temp2.toString();
    }
}