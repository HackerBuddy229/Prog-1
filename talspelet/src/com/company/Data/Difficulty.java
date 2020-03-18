package com.company.Data;

public enum Difficulty {
    Easy(100, 7), Medium(1000, 11), DEATHWISH(1000000, 1);

    private final int range;
    private final int numOfGuesses;

    Difficulty(int range, int numOfGuesses) {
        this.range = range;
        this.numOfGuesses = numOfGuesses;
    }
}
