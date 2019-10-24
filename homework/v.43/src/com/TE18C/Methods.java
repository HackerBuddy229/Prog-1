package com.TE18C;

public class Methods{

    /**
     * Prints the text "HAHAHAHAHAHAHA."
     */
    public static void lol(){
        System.out.println("HAHAHAHAHAHAHA.");
    }

    /**
     * outputs the smalest integer given
     * @param _numOne first integer
     * @param _numTwo second integer
     * @return smallest integer
     */
    public static int min(int _numOne, int _numTwo){
        if (_numOne < _numTwo) {
            return _numOne;
        } else {
            return _numTwo;
        }
    }

    /**
     * Prints 1->_times
     * @param _times to where to count(integer)
     */
    public static void count(int _times){
        for (int current = 1; current <= _times; current++){
            System.out.println(current);
        }
    }

    /**
     * converts celcius to kelvin
     * @param _celcius takes a double
     * @return returns double as kelving
     */
    public static double kelvin(double _celcius){

        return _celcius + 273.15;
    }

    /**
     * prints text coresponding to varius age groups.
     * @param _age integer representing age
     */
    public static void ageControll(int _age){
        if (_age >= 0 && _age <= 5){
            System.out.println("Småbarn får inte göra något.");
        } else if(_age <= 12){
            System.out.println("Du får spela Fortnite.");
        } else if(_age <= 14){
            System.out.println("Du är tonåring.");
        } else if(_age <= 17){
            System.out.println("Du får köra moppe.");
        } else if(_age <= 20){
            System.out.println("Du får köra bil.");
        } else if(_age <= 64){
            System.out.println("Du får vuxenstraff om du gör något dumt.");
        } else if(_age <= 99){
            System.out.println("Du är pensionär.");
        } else {
            System.out.println("R.I.P?");
        }
    }

    /**
     * Prints a fligth of stairs consisting of "#"
     * @param steps amount of layers integer
     */
    public static void stairs(int steps){
        String stair = "#";
        for (int flights = 0; flights < steps; ++flights){
            //System.out.println(stair);
            for (int i = 0; i <= flights; i++){
                System.out.print(stair);
            }
            //System.out.println();
        }

    }






}
