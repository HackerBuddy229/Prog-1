package com.TE18C;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverse("hej"));

    }

    /**
     *
     * @param _radius
     * @return
     */
    private static double volume(double _radius){
        return (4*Math.PI * Math.pow(_radius, 3))/3;
    }

    /**
     *
     * @param _str
     * @return
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
}
