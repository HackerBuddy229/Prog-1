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

    /**
     * Uses local acceleration, water density and depth to calculate the fluid pressure under water
     * @param _deep the depth at which to calculate
     * @return returns the Fluid pressure.
     */
    public static double pressureUnderWater(double _deep){
        return FluidTable.WATER.density*_deep*g_swe; // water density * acceleration * depth
    }

    /**
     * Calculate kinetic energy with mass and velocity.
     * @param _mass the mass of the object in question
     * @param _velocity the velocity of the object in question
     * @return returns the kinetic energy.
     */
    public static double kineticEnergy(double _mass, double _velocity){
        return (_mass*Math.pow(_velocity, 2))/2; // multiplies _mass with _velocity to the power of 2 and divides by 2
    }

    /**
     * calculates potential energy of an object by the mass and height of the object
     * @param _mass the mass of the object
     * @param _height the height of the object
     * @return the potential energy in joules
     */
    public static double potentialEnergy(double _mass, double _height) {
        return _mass * g_swe * _height; // the mass parameter multiplied with the gravitational acceleration in
                                        // sweden then multiplied with the height parameter
    }

    /**
     * returns the fall speed depending on height
     * @param _height the height of the object dropped
     * @return the fall speed at impact
     */
    public static double fallSpeed(double _height) {
        return Math.pow((2*_height)/g_swe, 1/2) * g_swe; // (((2*s)/2)¹/2) * g
    }

    /**
     * returns the difference between the two values
     * @param _first value 1
     * @param _last value 2
     * @return Delta
     */
    public static double delta(double _first, double _last){
        return _last - _first; // last value subtracted by the first value
    }

    /**
     * returns the mass of the volume of liquid
     * @param _fluid the aforementioned fluid
     * @param _volume the volume provided
     * @return returns the total mass
     */
    public static double volumeToMass(FluidTable _fluid, double _volume){
        return _fluid.density * _volume; // the density of the fluid provided times the volume provided
    }

    /**
     * returns the mass of the volume of gas
     * @param _gas the aforementioned gas
     * @param _volume the volume provided
     * @return returns the total mass
     */
    public static double volumeToMass(GasTable _gas, double _volume){
        return _gas.density * _volume; // the density of the gas provided times the volume provided
    }


    /**
     * returns the mass of the volume of solids
     * @param _solid the aforementioned gas
     * @param _volume the volume provided
     * @return returns the total mass
     */
    public static double volumeToMass(SolidTable _solid, double _volume){
        return _solid.density * _volume; // the density of the solid provided times the volume provided
    }

    /**
     * returns the average speed of an object by the distance and the time
     * @param _distance the distance the object traveled
     * @param _time the time it did it in
     * @return the average speed
     */
    public static double svtVelocity(double _distance, double _time){
        return _distance/_time; // the distance divided by the time
    }

    /**
     * retuns the distance traveled by the velocity and time
     * @param _velocity the velocity traveled at
     * @param _time the time it took place under
     * @return the distance covered
     */
    public static double svtDistance(double _velocity, double _time){
        return _velocity * _time;//velocity times time.
    }







}
