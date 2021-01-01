package com.company;

import java.util.Objects;

public class Schoolfootballclub extends SportsClub {
	public Schoolfootballclub(String club_name,String location,double various_statictics, String season, int wins, int draws,int defearts, int recieved_goals,int scored_goals, int current_points, int match_count){
		super(club_name,location, various_statictics,recieved_goals,scored_goals,current_points,season,wins,draws,defearts,match_count);

	}



	@Override
	public String toString() {
		return "School football Club";
	}



}
