package com.company.Services;


import com.company.Data.Leaderboard;
import com.company.Data.LeaderboardItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.*;


public class LeaderBoardService {
    private String filename = "Leaderboard.json";


    public LeaderBoardService() {

    }


    private Leaderboard fetchLeaderboard() throws IOException {

        String content = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filename)));
        String line;
        while((line = bufferedReader.readLine()) != null){
            content += line;
        }

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = new Gson();
        Leaderboard leaderboard = gson.fromJson(content, Leaderboard.class);

        return leaderboard;
    }

    private void saveLeaderboard(Leaderboard leaderboard) throws IOException {
        String jsonToString;

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonToString = gson.toJson(leaderboard);

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(jsonToString.getBytes());

        fileOutputStream.close();
    }

    public void addLeaderboardItem(LeaderboardItem leaderboardItem) throws IOException {

        Leaderboard leaderboard = fetchLeaderboard();
        leaderboard.leaderboard.add(leaderboardItem);

        saveLeaderboard(leaderboard);
    }

    public void resetLeaderboard() throws IOException {
        Leaderboard leaderboard = new Leaderboard();
        saveLeaderboard(leaderboard);
    }

    public void displayLeaderboard() throws IOException {
        Leaderboard leaderboard = fetchLeaderboard();

        for (LeaderboardItem leaderboardItem :
                leaderboard.leaderboard) {
            System.out.print(leaderboardItem.name);
            System.out.println("  " + leaderboardItem.score);
        }
    }



}
