package com.example;

public class Bedazzler {

    private static final String DELIMITER = "*";

    public static void main(String[] args) {
        System.out.println(bedazzle("This is my string"));
    }

    public static String bedazzle(String inputStr) {
        String outputStr = "";

        if (inputStr == null) {
            return "";
        }

        for (int i = 0; i < inputStr.length(); i++) {

            // Put a * in front of every character
            outputStr += DELIMITER;

            char currentChar = inputStr.charAt(i);

            // if the character is a space, double it
            if (currentChar == ' ') {
                outputStr += "  ";
            } else {
                // otherwise, just copy the character
                outputStr += currentChar;
            }
        }

        // If ends with non-space, then add a trailing *
        if (inputStr.charAt(inputStr.length() - 1) != ' ') {
            outputStr += DELIMITER;
        }

        return outputStr;
    }
}
