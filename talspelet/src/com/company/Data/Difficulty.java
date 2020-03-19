package com.company.Data;

public enum Difficulty {
    Easy(100, 7), Medium(1000, 11), DEATHWISH(1000000, 1);

    public final int range; // the max number that could be randomised
    public final int numOfGuesses; // the max number of guesses allowed

    Difficulty(int range, int numOfGuesses) {
        this.range = range;
        this.numOfGuesses = numOfGuesses;
    }
}
