package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class childrens_bedtime_story {
    public static void main(String[] args) {

        //All file name list below and array  for my listing looking file name purpose
        String [] allFileName= {"goldilocks.txt", "hansel_and_gretel.txt","mary_had_a_little_lamb.txt" };

        // scanner user for input the user file name
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter file name of the story: ");
        String textFileName = myscanner.nextLine();

        // try catch using for any error show me the in the code
        try {

            // BufferedReader: Reads text efficiently from a character-based input stream.	Reads characters from a file.
            BufferedReader reader = new BufferedReader(new FileReader(textFileName));

            // while loop using for true conditions.
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.printf("%d. %s%n", lineNumber, line);
                lineNumber++;
            }
        reader.close();
            myscanner.close();

        } catch (Exception ex) {
            System.err.println(" Show us runtime error" + textFileName);
        }


    }

}
