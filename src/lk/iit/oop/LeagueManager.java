package lk.iit.oop;

import lk.iit.oop.pojoclasess.SportsClub;

import java.io.IOException;

public interface LeagueManager {
    void create_club( SportsClub sportsClub);
    void delete_club( String club_name);
    void display_statistics(String club_name);
    void display_Premier_league();
    void update_match(String clubOname, String club_name, int pointOne, int pointTwo);
    void matchResultGUI();


    void saveData(String fileName) throws IOException;
    void retrieveData(String fileName) throws IOException, ClassNotFoundException;


}
