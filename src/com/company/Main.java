package com.company;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        boolean valid = true;

        System.out.println("you wanna ~purchase~ or ~check~ your ticket? ");
        String option = (getUserInput());
        switch (option) {
            case "purchase":
                purchase();
                break;

        }

    }

    public static String getUserInput() {
        String userInput = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            userInput = bufferedReader.readLine();


        } catch (Exception e) {
            System.out.println("Error in the user input menu" + e);
        }
        return userInput;
    }

    public static void purchase() {
        Random random = new Random();
        try {
            System.out.println("what is your name?");
            String name = getUserInput();
            int ticketNum = random.nextInt(300);
            String tickName = (name +" "+ticketNum);
            System.out.println(tickName);

        } catch (Exception e) {
            System.out.println("error in purchase menu " + e);
        }
    }

}

