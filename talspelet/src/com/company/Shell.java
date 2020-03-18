package com.company;

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
                leaderboard(input);
                break;
            case "Run":

                break;
        }
    }

    private void leaderboard(String[] arg) {
        switch (arg[1]){
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
                } catch (IOException e){
                    System.out.println(e);
                }

                break;
            default:
        }
    }

    private void run(String[] args){

    }



}
