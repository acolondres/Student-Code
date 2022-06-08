package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        // create scanner and has input functionality (system.in)
        Scanner userInput = new Scanner(System.in);

        // prompt user for input of what the search word is
        System.out.println("Please enter the search word:");
        String searchWord = userInput.nextLine();


        // prompt user for input of replacement word
        System.out.println("Please enter the replacement word:");
        String replacementWord = userInput.nextLine();

        // prompt user for input of file source (path)
        System.out.println("Please enter the source file (Path):");
        String sourceFile = userInput.nextLine();
        // verify the file exists



        // prompt user for input of destination file (path)
        // verify it DOESN'T already exist in try-catch block
        System.out.println("Please enter the destination file (Path):");
        String destinationFile = userInput.nextLine();

        try(Scanner fileScanner = new Scanner(sourceFile); PrintWriter writer = new PrintWriter(destinationFile)) {
            File createdDestinationFile = new File(destinationFile);


            if (!createdDestinationFile.exists()) {
                createdDestinationFile.createNewFile();
            } else {
                System.out.println("File already exists.");
            }

            // initialize scanner inside try to open file
            // initialize "print-writer" to print to new file and reader
            // also provide catch for possible exception


            // loop through the line to see if it contains search word or not


            // replace search word with replacement word


            // create a new file/directory

        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
        } catch (IOException ex) {
            System.out.println("A problem occurred trying to create new file.");
        }




    }

}
