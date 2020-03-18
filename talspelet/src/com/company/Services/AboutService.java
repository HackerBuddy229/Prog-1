package com.company.Services;

public class AboutService {
    private String play = "";
    private String blank = "";
    private String about = "";

    public AboutService() {
    }

    public void printAbout(String[] input) {
        switch (input[1]) {

            case "Play":
                System.out.println(play);
                break;
            case "About":
                System.out.println(about);
                break;
            case "":
            default:
                System.out.println(blank);
                break;

        }
    }
}
