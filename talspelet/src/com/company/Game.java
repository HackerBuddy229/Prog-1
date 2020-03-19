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


    /**
     * Checks correct init and launches the game loop
     */
    public void Begin(){
        if (difficulty != null && gameStats != null) {
            gameloop();
        }
    }

    /**
     * GameLoop consisting of
     * for difficult.#ofAtemptsAllowed
     * take input
     * add to gameStats
     * check win
     * handle leaderboard
     * present clue
     */
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
                    leaderBoardService.addLeaderboardItem(new LeaderboardItem(scanner.nextLine(), gameStats.guesses.size())); //Add score to leaderboard
                    leaderBoardService.displayLeaderboard();
                } catch (IOException e) {

                    System.out.println("Leaderboard failed");
                }

                break;
            }
                                                        //else

            presentClue(guessToInt);


        }

        PresentGameStats();
    }

    /**
     * Presents the instantiated class GameStats
     */
    private void PresentGameStats() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int guess: gameStats.guesses) {
            stringBuilder.append(guess);
            stringBuilder.append(", ");
        }
        System.out.println("You guessed " + gameStats.guesses.size() + " Times");
        System.out.println("Your guesses where:");
        System.out.println(stringBuilder.toString());
    }

    /**
     *
     * @param guess the guess for which to calculate the clue
     */
    private void presentClue(int guess) {
        if (gameStats.correctNumber < guess){
            System.out.println("you have guessed to big a number");
        } else {
            System.out.println("You have guessed to small a number");
        }
    }
}
