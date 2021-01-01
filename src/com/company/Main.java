package com.company;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

import static javafx.application.Application.launch;


public class Main  {

    private static LeagueManager manager = new PremierLeagueManager();
    static Scanner in = new Scanner(System.in).useDelimiter("\n");

    public static void create_club() {

        SportsClub sportsClub = null;

        System.out.println("Enter the SportsClub name");
        String clubname= Validation.stringValidation(in);

        System.out.println("Enter Location");
        String location = Validation.stringValidation(in);

        System.out.println("Enter the various statictics");
         int staticstic = Integer.parseInt(Validation.numValidation(in));


        while (true) {
            System.out.println("\nSelect your club type: Normal, School or University \n " +
                    "    a).  Normal Football Club \n" +                   // asking from the user to add a member type
                    "     b).  School Football Club \n" +
                    "     c).  University Football Club");
            String clubType = Validation.typeValidation(in);

            System.out.println("Enter the Season");
            String season = Validation.stringValidation(in);

            System.out.println("Enter the Wins");
            int wins = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Draws");
            int draws = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Defearts");
            int defearts = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Recieved Goals");
            int rgoals = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Scored Goals");
            int sgoals = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Current Points");
            int points = Integer.parseInt(Validation.numValidation(in));

            System.out.println("Enter the Match Count");
            int counts = Integer.parseInt(Validation.numValidation(in));



            switch (clubType) {  //transfer data to club type
                case "a":
                    sportsClub = new FootballClub(clubname, location, staticstic, season, wins, draws, defearts, rgoals, sgoals, points, counts);
                    break;
                case "b":
                    sportsClub = new Schoolfootballclub(clubname, location, staticstic, season, wins, draws, defearts, rgoals, sgoals, points, counts);
                    break;
                case "c":
                    sportsClub = new Univercityfootballclub(clubname, location, staticstic, season, wins, draws, defearts, rgoals, sgoals, points, counts);
                    break;
                default:
                    System.out.println("Invalid Option!!! Please re-enter...");
                    continue;
            }

            manager.create_club(sportsClub);   // added data
            System.out.println("Sport club added sucessfully");

            break;
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        manager.retrieveData("saveFile.txt"); //lodad data from save file

        menuloop:
        while (true) {   // main menu

            System.out.println("                                                   \n");
            System.out.println(" ********* Welcome to the Sports Club  ********* \n");
            System.out.println("                                               ");
            System.out.println("      ");
            System.out.println("\t\tWelcome to the Menu");
            System.out.println("      ");
            System.out.println("\tPress 1 to add a SportsClub");
            System.out.println("\tPress 2 to delete the club details");
            System.out.println("\tPress 3 to Display selected club");
            System.out.println("\tPress 4 to print the list of clubs");
            System.out.println("\tPress 5 to Update match");
            System.out.println("\tPress 6 to GUI");
            System.out.println("\tPress 7 to exit");

            Scanner sc = new Scanner(System.in);   //getting user choices
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    create_club();   //add club to the list
                    break;

                case 2:
                    delete_club();   //deleate selected club
                    break;

                case 3:
                    displayvariousstatictics(); // display selected club details
                    break;

                case 4:
                    displayPremierLeague();   //display all the clubs
                    break;

                case 5:
                    update_match();    //update club results
                    break;

                case 6:
                    matchResultGUI();    //open the GUI
                    break ;

                case 7:
                    manager.saveData("saveFile.txt");    // save data to txt file
                    break menuloop;
                default:
                    System.out.println("Choice is invalid!!! Please re-enter...");
            }
        }

    }

    private static void matchResultGUI() {
        manager.matchResultGUI();
    }


    private static void update_match() {  //updating match results
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the club One you want to update:");
        String clubOname = sc.nextLine();

        System.out.println("Please enter the points:");
        int pointOne = sc.nextInt();

        System.out.println("Please enter the name of the club Two you want to update:");
        String clubTname = sc.nextLine();

        System.out.println("Please enter the points:");
        int pointTwo = sc.nextInt();

        if (pointOne > pointTwo) {

        }
//manager.update_match(clubname);
    }

    private static void delete_club() {
        System.out.println("Please enter the name of the club you want to remove:");
        Scanner sc = new Scanner(System.in);
        String clubname = sc.nextLine();
        manager.delete_club(clubname); //sent data to delete_club method in PremierLeagueManager class
    }

    private static void displayvariousstatictics() {
        System.out.println("club name to view");
        Scanner sc = new Scanner(System.in);
        String clubname = sc.nextLine();
        manager.display_statistics(clubname); //display club from list
    }

    private static void displayPremierLeague() {

        manager.display_Premier_league();
    }

}


