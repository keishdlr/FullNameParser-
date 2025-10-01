package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {

    public static Scanner nameParse = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Choose a format to enter your name (without middle/with middle)"); // prompt the user to select a format
        String format = nameParse.nextLine(); // holds user input

        if (format.equalsIgnoreCase("with middle")){
            System.out.println("You chose a format with a middle name");
            System.out.println("Enter your name");
            String fullName = nameParse.nextLine().trim();

            String[] withMiddle = fullName.split(Pattern.quote(" "));
            System.out.println("First Name: " + withMiddle[0]);
            System.out.println("Middle Name: " + withMiddle[1]);
            System.out.println("Last Name: " + withMiddle[2]);
        }
        else {
            System.out.println("You chose a format without a middle name");
            System.out.println(" Enter your name");
            String fullName = nameParse.nextLine().trim();

            String[] woMiddle = fullName.split(Pattern.quote(" "));
            System.out.println("First Name: " + woMiddle[0]);
            System.out.println("Last Name: " + woMiddle[1]);

        }
    }

}