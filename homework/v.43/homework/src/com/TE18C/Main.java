package com.TE18C;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverse("hej"));

    }

    /**
     *  takes the radius of a sphere and returns the volume
     * @param _radius radius double
     * @return volume double
     */
    private static double volume(double _radius){
        return (4*Math.PI * Math.pow(_radius, 3))/3;
    }

    /**
     * Accepts a string as parameter and returns the string reversed
     * @param _str origin string
     * @return reversed _Str
     */
    private static String reverse(String _str){
        ArrayList<Character> res = new ArrayList<Character>();
/*
        for (int i = _str.length(); i > 0; i--){

                res.add(_str.substring(i-1, 1).charAt(0));


        }
*/
        for(int i=_str.length();i>0;i--)
        {
            res.add(_str.substring(i-1).charAt(0));
        }
        return res.toString();
    }

    /**
     *
     * @param _str
     * @param _c
     * @return
     */
    private static int count(String _str, String _c){
        int count = 0;
        int lastSeen = 0;
        while(true){
            lastSeen = _str.indexOf(_c, lastSeen);
            if (lastSeen != -1){
                count++;

            } else {break;}
        }
        return count;
    }
}
