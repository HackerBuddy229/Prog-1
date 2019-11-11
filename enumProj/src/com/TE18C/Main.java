package com.TE18C;

public class Main {

    public final double G = 0.00000000006674;
    public final double R = 8.3145;
    public final int p_0 = 1013;
    public final int c = 299792458;
    public final double g_swe = 9.84671;

    public static void main(String[] args) {
	// write your code here
    }


    /**
     * Converts _fahrenheit to celsius which is returned as a double.
     * @param _fahrenheit the temperature to be converted to Celcius.
     * @return returns the aforementioned temperature in celsius.
     */
    public static double fahrenheitToCelsius(double _fahrenheit){
        return (_fahrenheit - 32) * (5/9); // subtracts 32 and multiplies by 5/9
    }


}
