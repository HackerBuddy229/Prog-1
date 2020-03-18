package com.company;

import java.util.Scanner;

public class Shell {

    private Scanner scanner;
    private boolean run;

    public Shell() {
        this.scanner = new Scanner(System.in);
        this.run = true;

    }

    /**
     * Starts accepting input from the terminal.
     */
    public void initiate(){
        String[] input;
        while (run){

            input = acceptInput();
            if (input == null)  {
                continue;
            }


        }
    }

    /**
     * @return String array the first index being the primary command.
     */
    private String[] acceptInput() {
        String input = null;
        System.out.print("#");
        input = scanner.nextLine();
        return input.split(" ");
    }

    private void interpret(String[] input){
        switch (input[0]){
            case "About":

                break;
            case "":

                break;
        }
    }

}
