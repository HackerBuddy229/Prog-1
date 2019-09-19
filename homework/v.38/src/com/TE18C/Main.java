package com.TE18C;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Methods {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here

        String input = GetInput();
        String[] parsedInput = ParseInput(input);
        //DebugPring(parsedInput);
        ArrayList<Integer> IntegerInput = ConvertToInt(parsedInput);
        int min = SetMin(IntegerInput);
        int max = SetMax(IntegerInput);
        double avg = SetAvg(IntegerInput);
        Display(min, max, avg);
    }

}
