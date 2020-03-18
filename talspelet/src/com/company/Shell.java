package com.company;

import com.company.Services.*;

import java.util.Scanner;

public class Shell {

    private Scanner scanner;
    private boolean run;
    private AboutService about;

    public Shell() {
        this.scanner = new Scanner(System.in);
        this.run = true;
        this.about = new AboutService();

    }

    /**
     * Starts accepting input from the terminal.
     */
    public void initiate(){
        String[] input;
        while (run){

            input = acceptInput();
            if (input == null || input[0] == "")  {
                continue;
            }
            interpret(input);



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

    /**
     * @param input The input from the user consisting of index 0 main argument, index 1 and greater other arguments
     */
    private void interpret(String[] input){
        switch (input[0]){
            case "About":
                    about.printAbout(input);
                break;
            case "Leaderboard":

                break;
        }
    }



}
