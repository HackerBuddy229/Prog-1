package com.TE18C;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	// write your code here

        String input = GetInput();
        String[] parsedInput = ParseInput(input);
        //DebugPring(parsedInput);
        ArrayList<Integer> IntegerInput = ConvertToInt(parsedInput);

        int min = SetMin(IntegerInput);
        int max = SetMax(IntegerInput);
        float avg = SetAvg(IntegerInput);
    }

    private static float SetAvg(ArrayList<Integer> integerInput) {
        int total = 0;
        for (int num:integerInput
             ) {

                total = total + num;

        }
        return total/integerInput.size();


    }

    private static int SetMax(ArrayList<Integer> integerInput) {
        int max = 0;
        for (int num:integerInput
             ) {

            if (num > max) {
                max = num;
            }

        }
        return max;
    }

    private static int SetMin(ArrayList<Integer> integerInput) {
        int min = 0;
        for (int num:integerInput
             ) {

            if (num < min) {
                min = num;
            }


        }
        return min;
    }

    private static ArrayList<Integer> ConvertToInt(String[] parsedInput) {
        ArrayList<Integer> IntegerInput = new ArrayList<>(parsedInput.length);

        for (String x: parsedInput
             ) {
            IntegerInput.add(Integer.parseInt(x));

        }
        return IntegerInput;
    }

    private static void DebugPring(String[] parsedInput) {
        for (String x:parsedInput
             ) {
            System.out.println(x);
        }
    }

    private static String[] ParseInput(String input) {
        return input.split(" ");
    }

    private static String GetInput() {
        System.out.print("Skriv in 10 heltal: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}
