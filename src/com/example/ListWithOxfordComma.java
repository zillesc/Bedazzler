package com.example;

/**
 * Created by zilles on 9/5/17.
 */
public class ListWithOxfordComma {

    public static String toString(String [] array) {
        String outputString = "";

        if (array == null) {
            return outputString;
        }

        // If length is less than two, we don't have to worry about commas and "and"
        if (array.length < 2) {
            if (array.length == 1) {
                outputString = array[0];
            }
            // if length is 0, then leave outputString as the empty String.
        } else {
            // handle all but the last element, with following comma
            for (int i = 0; i < array.length - 1; i++) {
                outputString += array[i] + ", ";
            }
            // last element has a leading "and"
            outputString += "and " + array[array.length - 1];
        }

        return outputString;
    }
}
