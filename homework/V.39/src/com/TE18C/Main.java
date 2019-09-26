package com.TE18C;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        ArrayList<Integer> inputInt= toint(inputArray);
        System.out.println(inputInt.get(1) * 2 - inputInt.get(0));
    }

    /**
     * Converts String[] to ArrayList<Integer>
     * @param y String[] with 2 entrys
     * @return ArrayList<Integer> with 2 entrys
     */
    private static ArrayList<Integer> toint(String[] y){

        ArrayList<Integer> i = new ArrayList<>();
        for (int x = 0; x < 2; x++) {
            i.add(Integer.parseInt(y[x]));
        }
        return i;

    }
}
