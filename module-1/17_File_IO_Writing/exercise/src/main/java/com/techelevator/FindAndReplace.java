package com.techelevator;

import java.io.*;
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

        try(Scanner fileScanner = new Scanner(sourceFile);
            PrintWriter writer = new PrintWriter(destinationFile)) {
            File createdDestinationFile = new File(destinationFile);


            if (!createdDestinationFile.exists()) {
                createdDestinationFile.createNewFile();
            } else {
                System.out.println("File already exists.");
            }
            try {
                // create FileWriter object
                FileWriter fileOut = new FileWriter(destinationFile);
                // create BufferedWriter object
                BufferedWriter bw = new BufferedWriter(fileOut);

                // create scanner object
                Scanner fileRead = new Scanner(new File(sourceFile));
                // check next line present or not
                while (fileRead.hasNextLine()) {
                    // read each line
                    String data = fileRead.nextLine();
                    // write data to the destination file
                    bw.write(data.replace(searchWord, replacementWord));
                    bw.newLine();
                }
                bw.flush();
                bw.close();
                fileRead.close();
                System.out.println("Data replaced successfully.");
            } finally {
                // leave empty I guess? it works
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
        } catch (IOException ex) {
            System.out.println("A problem occurred trying to create new file.");
        }

            }

        }

//https://www.youtube.com/watch?v=NVqgVwS9Le0
// https://www.youtube.com/watch?v=hgF21imQ_Is bufferedWriter tutorials super useful