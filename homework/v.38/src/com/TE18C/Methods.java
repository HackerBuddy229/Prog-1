package com.TE18C;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    /**
     * Prints information regarding the highest number, the lowest number and the average to the console.
     * @param min an integer representing the lowest number
     * @param max an integer representing the highest number
     * @param avg a double representing the average
     */
    protected static void Display(int min, int max, double avg) {
        System.out.println("Högst: " + max);
        System.out.println("Lägst: " + min);
        System.out.println("medelvärde: " + avg);
    }

    /**
     * uses integerInput to resolve and return the average of the arrayList
     * @param integerInput an arraylist consisting of integers
     * @return returns the average of the integerInput arraylist in the form of a double
     */
    protected static double SetAvg(ArrayList<Integer> integerInput) {
        int total = 0;
        for (int num:integerInput
             ) {

                total = total + num;

        }
        double i = (double)total / integerInput.size();
        return i;


    }

    /**
     * Uses integerInput to resolve and return the highest number existing in the arraylist
     * @param integerInput an arraylist consisting of integers
     * @return returns an integer that represents the highest entry in the arraylist
     */
    protected static int SetMax(ArrayList<Integer> integerInput) {
        int max = 0;
        for (int num:integerInput
             ) {

            if (num > max) {
                max = num;
            }

        }
        return max;
    }

    /**
     *Uses integerInput to resolve and return the lowest number existing in the arraylist
     * @param integerInput an arraylist consisting of integers
     * @return returns an integer that represents the lowest entry in the arraylist
     */
    protected static int SetMin(ArrayList<Integer> integerInput) {
        int min = integerInput.get(0);
        for (int num:integerInput
             ) {

            if (num < min) {
                min = num;
            }


        }
        return min;
    }

    /**
     *Converts an array of strings to an arraylist of int
     * @param parsedInput an array consisting of strings
     * @return an arraylist of int
     */
    protected static ArrayList<Integer> ConvertToInt(String[] parsedInput) {
        ArrayList<Integer> IntegerInput = new ArrayList<>(parsedInput.length);

        for (String x: parsedInput
             ) {
            IntegerInput.add(Integer.parseInt(x));

        }
        return IntegerInput;
    }

    /**
     *Prints out the content of an array of strings for debug purposes
     * @param parsedInput an array of strings
     */
    private static void DebugPring(String[] parsedInput) {
        for (String x:parsedInput
             ) {
            System.out.println(x);
        }
    }

    /**
     *Formats a string containing multiple inputs separated by " " into an array of strings
     * @param input String to be broken up into an array
     * @return  an array of strings
     */
    protected static String[] ParseInput(String input) {
        return input.split(" ");
    }

    /**
     *Prints a prompt to the console and awaits a string
     * @return formentioned string
     */
    protected static String GetInput() {
        System.out.print("Skriv in 10 heltal: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}
