package com.company;

import java.io.IOException;

public interface LeagueManager {
    void create_club( SportsClub sportsClub);
    void delete_club( String club_name);
    void display_statistics(String club_name);
    void display_Premier_league();
    void update_match(String club_name);
    void matchResultGUI();


    void saveData(String fileName) throws IOException;
    void retrieveData(String fileName) throws IOException, ClassNotFoundException;


}
