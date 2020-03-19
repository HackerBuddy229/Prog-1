package com.company;
import com.company.Data.*;
import com.company.Services.LeaderBoardService;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Difficulty difficulty;
    private GameStats gameStats;
    private Scanner scanner;
    private LeaderBoardService leaderBoardService;

    public Game(Difficulty difficulty, Scanner scanner) {

        this.difficulty = difficulty;
        Random random = new Random();
        int correctNum = random.nextInt(difficulty.range);
        this.gameStats = new GameStats(correctNum);
        this.scanner = scanner;
        this.leaderBoardService = new LeaderBoardService();

    }


    public void Begin(){
        if (difficulty != null && gameStats != null) {
            gameloop();
        }
    }

    private void gameloop(){
        for (int index = 0; index < difficulty.numOfGuesses; index++){
            System.out.println("Please guess a number");
            String guess = scanner.nextLine();
            int guessToInt;
            try {
                guessToInt = Integer.parseInt(guess);
            } catch (NumberFormatException e){
                System.out.println("Not a number");
                continue;
            }

            gameStats.guesses.add(guessToInt);
            if (guessToInt == gameStats.correctNumber) { //If victory
                System.out.println("You have won!");
                System.out.println("what is your name?");
                try {
                    leaderBoardService.addLeaderboardItem(new LeaderboardItem(scanner.nextLine(), gameStats.guesses.size()));
                    leaderBoardService.displayLeaderboard();
                } catch (IOException e) {
                    scanner.nextLine();
                }

                break;
            }
                                                        //else

            presentClue(guessToInt);


        }
    }

    private void presentClue(int guess) {
        if (gameStats.correctNumber < guess){
            System.out.println("you have guessed to big a number");
        } else {
            System.out.println("You have guessed to small a number");
        }
    }
}
