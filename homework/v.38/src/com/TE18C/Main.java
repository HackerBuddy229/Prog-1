package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String input = GetInput();
        String[] parsedInput = ParseInput(input);

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
