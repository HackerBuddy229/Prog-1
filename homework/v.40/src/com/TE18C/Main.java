package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Time tm = new Time(sc.nextInt(), sc.nextInt());
        tm = removeff(tm);
        System.out.println(tm.getHour() + " " + tm.getMinute());
    }

    /**
     * Removes 45 minutes from a Time instance
     * @param _time
     * @return
     */
    private static Time removeff(Time _time){


        if (_time.getMinutesMinus(45) < 0){
            Time tm = new Time(23, _time.getMinute() + 60);
            int hour = tm.getMinutesMinus(45)/60;
            int minute = tm.getMinutesMinus(45)%60;
            return new Time(hour, minute);


        } else {
            int hour = _time.getMinutesMinus(45)/60;
            int minute = _time.getMinutesMinus(45)%60;
            return new Time(hour, minute);
        }





    }


}

class Time {
    final int Hour;
    final int Minute;

    public Time(int hour, int minute) {
        Hour = hour;
        Minute = minute;
    }

    public int getMinutesMinus(int x) {
        return getHour()*60 + getMinute() - x;
    }

    public int getHour() {
        return Hour;
    }

    public int getMinute() {
        return Minute;
    }
}
