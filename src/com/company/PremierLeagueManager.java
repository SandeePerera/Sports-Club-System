package com.company;
import com.company.GUI.MatchTableGUI;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class PremierLeagueManager implements LeagueManager {

    private ArrayList<SportsClub> sportsClubList = new ArrayList<>();   // array list for sports club


    @Override
    public void create_club(SportsClub sportsClub) {
        for (SportsClub sportsClub1 : sportsClubList) {
            if (sportsClub.equals(sportsClub1)) {
                System.out.println("club is already in the sport club list");

            }
        }
                sportsClubList.add(sportsClub);
    }


    @Override
    public void delete_club(String club_name) {
        boolean foundclub = false;
        for (SportsClub sportsClub : sportsClubList) {
            if (sportsClub.getClub_name().equals(club_name)) {
                sportsClubList.remove(sportsClub);
                foundclub = true;
                System.out.printf("club was removed successfully!");
                break;
            }
        }
        if (!foundclub) {
            System.out.printf("club is not available\n", club_name);
        }

    }

    @Override
        public void display_statistics(String club_name) {
        if (sportsClubList.isEmpty()) {
            System.out.println("No clubs are in the Sports clubs at the Moment!");
        } else {
            boolean fond = false;
            for (SportsClub sportsClub : sportsClubList) {

                if (sportsClub.getClub_name().equals(club_name)) {
                    fond = true;

                    System.out.println("List of All clubs");
                     Collections.sort(sportsClubList, new PointComparator().reversed());

                    System.out.println(sportsClub);
                }

                break;
            }

            if (!fond) {
                System.out.println("invalid club name");
            }
        }

    }



    @Override    //print list of clubs
    public void display_Premier_league() {
       if (sportsClubList.isEmpty()) {
            System.out.println("no clubs found");
            return;
        }
        System.out.println("                                                      List of all clubs currently available");
        System.out.println("    ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %25s %15s %25s %20s %20s %20s %10s %10s %15s %15s", "Club Type", "Club Name", "Location", "Various Statictics", "Recieved Goals", "Scored Goals", "Current Points","Wins","Draws","defearts","match_count");
        System.out.println("   ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         Collections.sort(sportsClubList, new PointComparator().reversed());

        for (SportsClub sportsClub : sportsClubList) {
            System.out.format("%15s %12s %15s %20s %20s %22s %20s %15s %9s %13s %12" +
                            "s",
                    sportsClub,sportsClub.getClub_name(),sportsClub.getLocation(),sportsClub.getVarious_statictics(),sportsClub.getRecieved_goals(),sportsClub.getScored_goals(),sportsClub.getCurrent_points(),sportsClub.getWins(),sportsClub.getDraws(),sportsClub.getDefearts(),sportsClub.getMatch_count());
            System.out.println();

        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


    @Override
    public void update_match(String club_name) {
        boolean foundclub = false;
        for (SportsClub sportsClub : sportsClubList) {
            if (sportsClub.getClub_name().equals(club_name)) {
                System.out.println("Entecr the match details");
               // System.out.println("Entecr the Season");
               // sportsClubList.add(sportsClub);

                foundclub = true;
                System.out.printf("club was updated successfully!");
                break;
            }
        }
        if (!foundclub) {
            System.out.printf("club is not available\n", club_name);
        }


        }
    @Override
    public void matchResultGUI() {
        Application.launch(MatchTableGUI.class);

    }



    public void saveData(String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("saveFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(sportsClubList);

        System.out.println("club have been saved successfully");
    }

    public void retrieveData(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("saveFile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            sportsClubList = (ArrayList<SportsClub>) objectInputStream.readObject();

        } catch (Exception e) {

        }
        System.out.println("Vehicles have been loaded successfully");



    }
}


