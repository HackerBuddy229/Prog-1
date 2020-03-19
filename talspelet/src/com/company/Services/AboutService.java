package com.company.Services;

public class AboutService {
    private String Run = "The Run Command has 3 difficulties available \n" +
                        "Easy: range = 100, number of guesses = 7 \n" +
                        "Medium: range = 1000, number of guesses = 11 \n" +
                        "DEATHWISH: range = 1 000 000, number of guesses = 1";
    private String blank = "A common command will look like this\n" +
                            "PrimaryCommand SecondaryArgument\n" +
                            "The commands that you can choose between are\n" +
                            "Run, About, Leaderboard, Exit";
    private String Leaderboard = "The Leaderboard command will allow you to handle the leaderboard\n" +
                            "The following commands are available\n" +
                            "Reset: resets the leaderboard\n" +
                            "Show: displays the current leaderboard";

    public AboutService() {
    }

    public void printAbout(String[] input) {
        switch (input[1]) {

            case "Run":
                System.out.println(Run);
                break;
            case "Leaderboard":
                System.out.println(Leaderboard);
                break;
            case "":
            default:
                System.out.println(blank);
                break;

        }
    }
}
