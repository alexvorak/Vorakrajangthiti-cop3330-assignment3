/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFileParser {
    public static void main(String[] args) throws FileNotFoundException {
        {
            Scanner scanner = new Scanner(new File("C:\\Users\\AlexV\\Documents\\exercise42_input.txt"));
            scanner.useDelimiter(",");
            ArrayList<String> list = new ArrayList<>();
            System.out.printf("%s\t%s\t%s\n", "Last", "First", "Salary\n" + "--------------------------\n");
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
            for (int i = 0; i < list.size(); i +=3) {
                System.out.printf("%s\t%s\t\t%s", list.get(i), list.get(i + 1), list.get(i + 2));
            }
        }
    }
}


