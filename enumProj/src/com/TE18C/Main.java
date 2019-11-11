package com.TE18C;

public class Main {

    public static final double G = 0.00000000006674;
    public static final double R = 8.3145;
    public static final int p_0 = 1013;
    public static final int c = 299792458;
    public static final double g_swe = 9.84671;

    public static void main(String[] args) {
	// write your code here
    }


    /**
     * Converts _fahrenheit to celsius which is returned as a double.
     * @param _fahrenheit the temperature to be converted to Celsius.
     * @return returns the aforementioned temperature in celsius.
     */
    public static double fahrenheitToCelsius(double _fahrenheit){
        return (_fahrenheit - 32) * (5/9); // subtracts 32 and multiplies by 5/9
    }

    /**
     * Converts Celsius to Kelvin.
     * @param _kelvin The temperature to be converted to Celsius.
     * @return returns the converted value in celsius.
     */
    public static double kelvinToCelsius(double _kelvin){
        return _kelvin + 273.15; // adds 273.15
    }

    /**
     * Uses local acceleration, fluid density and depth to calculate the fluid pressure
     * @param _fluid An enum containing among other variables the density.
     * @param _deep the depth at which to calculate
     * @return returns the Fluid pressure.
     */
    public static double fluidPressure(FluidTable _fluid, double _deep){
        return _fluid.density*_deep*g_swe; // density * acceleration * depth
    }
}
