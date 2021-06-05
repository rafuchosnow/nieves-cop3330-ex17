/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AlcoholCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dfAlcohol = new DecimalFormat("#.##");

        String alcoholString = "abc";
        while(alcoholString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("Alcohol consumed in ounces? ");
            alcoholString = input.nextLine();
        }
        double alcoholNumber = Double.parseDouble(alcoholString);

        String weightString = "abc";
        while(weightString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("What is the body weight? (in pounds) ");
            weightString = input.nextLine();
        }
        double weightNumber = Double.parseDouble(weightString);

        String genderString = "abc";
        while(genderString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("What is your gender? (1 for M, 2 for F) ");
            genderString = input.nextLine();
        }
        int genderNumber = Integer.parseInt(genderString);

        String hourString = "abc";
        while(hourString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("Hours since last drink? ");
            hourString = input.nextLine();
        }
        double hourNumber = Double.parseDouble(hourString);

        double ratio;

        if(genderNumber == 1){
            ratio = 0.73;
        }
        else{
            ratio = 0.66;
        }

        double legalBAC = 0.08;
        double BAC = ((alcoholNumber * 5.14) / (weightNumber * ratio)) - (.015 * hourNumber);

        System.out.println("Your BAC is " + dfAlcohol.format(BAC));

        String outputString = (BAC >= legalBAC) ?
                "It is not legal for you to drive." : "You can legally drive." ;

        System.out.println(outputString);

    }
}
