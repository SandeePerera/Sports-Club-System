package lk.iit.oop.pojoclasess;


public class FootballClub extends SportsClub {


            public FootballClub(String club_name,String location,double various_statictics, String season, int wins, int draws,int defearts, int recieved_goals,int scored_goals, int current_points, int match_count){
                super(club_name,location, various_statictics,recieved_goals,scored_goals,current_points,season,wins,draws,defearts,match_count);

            }



            @Override
            public String toString() {
                return "Normal football Club";
            }



        }





