package com.company.Data;

import java.util.ArrayList;

public class GameStats {
    public ArrayList<Integer> guesses; //the integers that have been guessed
    public int correctNumber; // the correct number


    public GameStats(int correctNumber) {
        guesses = new ArrayList<Integer>();
        this.correctNumber = correctNumber;

    }
}
