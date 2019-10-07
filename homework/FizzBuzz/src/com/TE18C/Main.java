package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int[] input = new int[] {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
        };

        for (int times = 1; times <= input[2]; times++){
            if (FizzBuzz(input, times)) {
                System.out.println("FizzBuzz");

            } else if (Fizz(input, times)) {
                System.out.println("Fizz");
            } else if (Buzz(input, times)){
                System.out.println("Buzz");
            }else {
                System.out.println(times);
            }
        }
    }

    private static boolean Buzz(int[] input, int times) {
        if (times % input[1] == 0) {
            return true;
        } else {return false;}
    }

    private static boolean Fizz(int[] input, int times) {
        if (times % input[0] == 0) {
            return true;
        } else {return false;}
    }

    private static boolean FizzBuzz(int[] x, int times) {
        if (times % x[1] == 0 && times % x[0] == 0){
            return true;
        } else {
            return false;
        }
    }
}
