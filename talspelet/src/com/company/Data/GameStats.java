package com.company.Data;

import java.util.ArrayList;

public class GameStats {
    public ArrayList<Integer> guesses;
    public int correctNumber;


    public GameStats(int correctNumber) {
        guesses = new ArrayList<Integer>();
        correctNumber = correctNumber;

    }
}
