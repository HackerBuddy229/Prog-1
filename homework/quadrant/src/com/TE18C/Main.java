package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        Cordinate point = new Cordinate(x, y);

        if (IsUp(point) && IsLeft(point)){
            System.out.println("2");
        } else if (IsUp(point) && !IsLeft(point)) {
            System.out.println("1");
        } else if (!IsUp(point) && IsLeft(point)) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

    }

    static boolean IsUp(Cordinate point) {
        if (point.getY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean IsLeft(Cordinate point) {
        if (point.getX() < 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Cordinate {
    private final int x;
    private final int y;

    public Cordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
