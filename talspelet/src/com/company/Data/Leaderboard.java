package com.company.Data;

import java.util.ArrayList;

public class Leaderboard {

    public ArrayList<LeaderboardItem> leaderboard; // an array list containing all entry's to the leaderboard

    public Leaderboard() {
        leaderboard = new ArrayList<LeaderboardItem>();
    }

    public ArrayList<LeaderboardItem> getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(ArrayList<LeaderboardItem> leaderboard) {
        this.leaderboard = leaderboard;
    }
}
