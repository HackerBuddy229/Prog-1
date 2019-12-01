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

    private static void SolveQuestions(){
        System.out.println("60 liters of iron weights:");
        System.out.println(volumeToMass(SolidTable.IRON, 60/0.001));
        System.out.println("---");
        System.out.println("Tomas hinner:");
        System.out.println(svtDistance(2.7, 50*60));
        System.out.println("---");
        System.out.println("Det tar");
        System.out.println(heat(FluidTable.WATER, volumeToMass(FluidTable.WATER, 4/0.001), 100-22));
        System.out.println("--");
        System.out.println("Det är:");
        System.out.println(fluidPressure(FluidTable.WATER, 75));
        System.out.println("---");
        System.out.println("bollen når:");
        System.out.println(velocityToHeight(kmHourToMeterSeconds(60)));
        System.out.println("---");
        System.out.println("Effekten är:");
        System.out.println(kineticEnergy(735, 100/3.6)/4.8);
        System.out.println("---");
        System.out.println("Den Studsar:");
        int bounceNumber = 0;
        double energyRemaining = potentialEnergy(1, 12);
        while (true){
            energyRemaining = energyRemaining * 0.99;

            if (energyToHeight(1, energyRemaining) < 5){
                System.out.println(bounceNumber);
                break;
            }
            bounceNumber++;

        }
        System.out.println("---");
        System.out.println("what is 55 fahrenheit in Celsius:");
        System.out.println(fahrenheitToCelsius(55));
        System.out.println("---");
        System.out.println("what is the difference between 55 and 87");
        System.out.println(delta(55, 87));
        System.out.println("---");
        System.out.println("How much work i performed by lifting a 1kg heavy object one meter in the air");
        System.out.println(work(gravitationalForce(1), 1));


    }

    /**
     * returns the gravitational force exerted by the mass of the object
     * @param _mass the mass of the object
     * @return the force exerted
     */
    private static double gravitationalForce(double _mass) {
        return g_swe*_mass; // g times the mass of the object
    }

    /**
     * returns the height an object is at or can reach by the mass and total energy
     * @param _mass the mass of the object
     * @param _energy the total energy of the object
     * @return the height achieved
     */
    private static double energyToHeight(double _mass, double _energy) {
        return (_energy/g_swe)/_mass; // energy divided by g divided by the mass
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

    /**
     * returns the time traveled by the distance and velocity
     * @param _distance the distance traveled
     * @param _velocity the velocity traveled at
     * @return the time it took
     */
    public static double svtTime(double _distance, double _velocity){
        return _distance / _velocity; //distance divided by velocity
    }

    /**
     * returns the work
     * @param _force the force used
     * @param _distance the distance covered
     * @return the work
     */
    public static double work(double _force, double _distance){
        return _force * _distance; // the force times the distance
    }

    /**
     * returns the power consumption by the work and the time
     * @param _work the work performed
     * @param _time the time it was performed under
     * @return the power consumption
     */
    public static double power(double _work, double _time){
        return _work/_time;//the work divided by the time
    }

    /**
     * returns the energy needed to heat a material by the mass, the heat capacity and the delta temp
     * @param _solid the solid in question
     * @param _mass the mass of the metal
     * @param _deltaT the difference in temperature
     * @return the energy needed
     */
    public static double heat(SolidTable _solid, double _mass, double _deltaT){
        return _solid.heatCapacity*_mass*_deltaT;//heat capacity times the mass times the difference in temperature.
    }


    /**
     * returns the energy needed to heat a fluid by the mass, the heat capacity and the delta temp
     * @param _fluid the fluid in question
     * @param _mass the mass of the metal
     * @param _deltaT the difference in temperature
     * @return the energy needed
     */
    public static double heat(FluidTable _fluid, double _mass, double _deltaT){
        return _fluid.heatCapacity*_mass*_deltaT;//heat capacity times the mass times the difference in temperature.
    }



    /**
     * returns the energy needed to heat a gas by the mass, the heat capacity and the delta temp
     * @param _gas the gas in question
     * @param _mass the mass of the metal
     * @param _deltaT the difference in temperature
     * @return the energy needed
     */
    public static double heat(GasTable _gas, double _mass, double _deltaT) {
        return _gas.heatCapacity * _mass * _deltaT;//heat capacity times the mass times the difference in temperature.
    }

    /**
     * returns the height an object achieves by the initial velocity
     * @param _velocity the initial velocity
     * @return the height achieved
     */
    public static double velocityToHeight(double _velocity){
        double t = _velocity/((-1)*g_swe);
        double a = (-1)*g_swe;
        double result = (_velocity*t)+((a*Math.pow(t, 2))/(2));
        return result;                                              //velocity times travel time plus acceleration times
                                                                    // time to the power of two divided by two
    }

    /**
     * calculates meters per second from km per hour using km per hour
     * @param _kmHour the speed in km per hour
     * @return the speed in meters per second
     */
    public static double kmHourToMeterSeconds(double _kmHour){
        return _kmHour/3.6;
    }

    /**
     * returns the average speed by the diffrence in distance and time
     * @param _deltaDistance the diffrence in distance
     * @param _deltaTime the diffrence in time
     * @return the average speed
     */
    public static double averageSpeed(double _deltaDistance, double _deltaTime){
        return _deltaDistance/_deltaTime;
    }

    /**
     * returns the impulse by the force and diffrence in time
     * @param _force the force applied
     * @param _DeltaTime the diffrence in time
     * @return the impuls
     */
    public static double impulse(double _force, double _DeltaTime){
        return _force*_DeltaTime;
    }

    /**
     * returns the mass of a cylinder of a metal
     * @param _solid the solid that the cylinder consists of
     * @param _radius the radius of the cylinder
     * @param _height the hieght of the cylinder
     * @return the mass of the cylinder
     */
    public static double CylinderMass(SolidTable _solid, double _radius, double _height){
        return ((Math.PI*Math.pow(_radius, 2)*_height)/3)*_solid.density;
    }

    /**
     * returns the mass of a globe of a metal
     * @param _solid the solid that the globe consists of
     * @param _radius the radius of the globe
     * @return the mass of the globe
     */
    public static double globeMass(SolidTable _solid, double _radius){
        return ((Math.PI*Math.pow(_radius, 4)*4)/3)*_solid.density;
    }

    /**
     * returns the mass of a pyramid of a solid
     * @param _solid the solid the pyramid consists of
     * @param _side the length of the base of the pyramid
     * @param _height the height of the pyramid
     * @return the mass of the pyramid
     */
    public static double pyramidMass(SolidTable _solid, double _side, double _height){
        return ((_side*_side)*_height)/3;
    }


    







}
