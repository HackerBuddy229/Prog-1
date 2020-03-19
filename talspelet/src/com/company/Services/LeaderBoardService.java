package com.company.Services;


import com.company.Data.Leaderboard;
import com.company.Data.LeaderboardItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.*;


public class LeaderBoardService {
    private String filename = "Leaderboard.json"; //the name of the json file containing the leaderboard


    public LeaderBoardService() {

    }


    /**
     * reads from filename and searializes json into Leaderboard class
     * @return Leaderboard class from filename
     * @throws IOException throw in case of file not found or Json Error
     */
    private Leaderboard fetchLeaderboard() throws IOException {

        String content = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filename)));
        String line;
        while((line = bufferedReader.readLine()) != null){
            content += line;                                    //while new line exists add to string
        }

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = new Gson();
        Leaderboard leaderboard = gson.fromJson(content, Leaderboard.class); //Serialize json to Leaderboard Class

        return leaderboard;
    }

    /**
     * deserialize Leaderboard class to json and saves to filename
     * @param leaderboard current Leaderboard class
     * @throws IOException throws in case of fileNotFound or jsonError
     */
    private void saveLeaderboard(Leaderboard leaderboard) throws IOException {
        String jsonToString;

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonToString = gson.toJson(leaderboard);                //turns leaderboard param to json

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(jsonToString.getBytes());        //writes json to filename

        fileOutputStream.close();                               //closes fileStream
    }

    /**
     * @param leaderboardItem the item to be added to the current instance of Leaderboard
     * @throws IOException // see fetchLeaderboard and saveLeaderboard
     */
    public void addLeaderboardItem(LeaderboardItem leaderboardItem) throws IOException {

        Leaderboard leaderboard = fetchLeaderboard();
        leaderboard.leaderboard.add(leaderboardItem);

        saveLeaderboard(leaderboard);
    }

    /**
     * Saves a new instance of Leaderboard to filename
     * @throws IOException see saveLederboard
     */
    public void resetLeaderboard() throws IOException {
        Leaderboard leaderboard = new Leaderboard();
        saveLeaderboard(leaderboard);
    }

    /**
     * Displays the current leaderboard
     * @throws IOException see fetchLeaderboard
     */
    public void displayLeaderboard() throws IOException {
        Leaderboard leaderboard = fetchLeaderboard();

        for (LeaderboardItem leaderboardItem :
                leaderboard.leaderboard) {
            System.out.print(leaderboardItem.name);
            System.out.println("  " + leaderboardItem.score);
        }
    }



}
