package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {

    public static Scanner nameParse = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Choose a format to enter your name (without middle/with middle)"); // prompt the user to select a format
        String format = nameParse.nextLine(); // holds user input to format of name

        if (format.equalsIgnoreCase("with middle")){ // if with middle was chosen run this
            System.out.println("You chose a format with a middle name");
            System.out.println("Enter your name"); // ask user to input their name
            String fullName = nameParse.nextLine().trim(); // holds user name

            String[] withMiddle = fullName.split(Pattern.quote(" ")); // turn their name into an array. item in array is separated by a 'space'
            System.out.println("First Name: " + withMiddle[0]);
            System.out.println("Middle Name: " + withMiddle[1]);  // output of their name assigning each array item to a line
            System.out.println("Last Name: " + withMiddle[2]);
        }
        else {                                                      // if without middle was chosen run this
            System.out.println("You chose a format without a middle name");
            System.out.println(" Enter your name"); // ask user for their name
            String fullName = nameParse.nextLine().trim(); // holds user name

            String[] woMiddle = fullName.split(Pattern.quote(" ")); // turn that name into an array
            System.out.println("First Name: " + woMiddle[0]);
            System.out.println("Last Name: " + woMiddle[1]);  // output their name, assigning an item per line

        }
    }

}