package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= input; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
