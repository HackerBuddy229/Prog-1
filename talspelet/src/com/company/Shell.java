package com.company;

import com.company.Data.Difficulty;
import com.company.Data.Leaderboard;
import com.company.Services.*;
import com.company.Services.LeaderBoardService;

import java.io.IOException;
import java.util.Scanner;

public class Shell {

    private Scanner scanner;
    private boolean run;
    private AboutService about;
    private LeaderBoardService leaderboard;

    public Shell() {
        this.scanner = new Scanner(System.in);
        this.run = true;
        this.about = new AboutService();
        this.leaderboard = new LeaderBoardService();
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
            if (input[0].equals("Exit")){
                break;
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
        try{
            String test = input[1];

        } catch (ArrayIndexOutOfBoundsException e){
            String temp = input[0];
            input = new String[]{
                    temp,
                    ""
            };
        }

        switch (input[0]){
            case "About":
                about.printAbout(input);
                break;
            case "Leaderboard":
                leaderboard(input);
                break;
            case "Run":
                run(input);
                break;
        }
    }

    /**
     * Sorts varius requests aimed for the leaderboard command
     * @param arg the user input from acceptInput()
     */
    private void leaderboard(String[] arg) {

            switch (arg[1]) {
                case "Reset":
                    try {
                        leaderboard.resetLeaderboard();
                    } catch (IOException e) {
                        System.out.println(e);
                    }

                    break;
                case "Show":
                    try {
                        leaderboard.displayLeaderboard();
                    } catch (IOException e) {
                        System.out.println(e);
                    }

                    break;
                default:
            }

    }

    /**
     * Sorts varius requests aimed for the run command
     * @param args the user input from acceptInput()
     */
    private void run(String[] args){

        switch (args[1]){
            case "Medium":
                new Game(Difficulty.Medium, scanner).Begin();
                break;
            case "DEATHWISH":
                new Game(Difficulty.DEATHWISH, scanner).Begin();
                break;
            default:
                new Game(Difficulty.Easy, scanner).Begin();
        }
    }



}
