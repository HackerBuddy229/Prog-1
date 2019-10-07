package com.TE18C;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        for(int i = 0; i < 10; i++){
            input[i] = sc.nextInt();
        }
        ArrayList<Integer> u = new ArrayList<>();
        for (int x : input) {
            if (!u.contains(x%42)){
                u.add(x%42);
            }
        }
        System.out.println(u.size());
    }
}
