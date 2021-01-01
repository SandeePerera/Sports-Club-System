package com.company;

import java.io.Serializable;
import java.util.Objects;


public abstract class SportsClub implements Serializable {

    private String club_name;
    private String location;
    private double various_statictics;
    private int recieved_goals;
    private int scored_goals;
    private int current_points;
    private String season;
    private int wins;
    private int draws;
    private int defearts;
    private int match_count;

    public SportsClub(String club_name, String location, double various_statictics, int recieved_goals, int scored_goals, int current_points, String season, int wins, int draws, int defearts, int match_count) {
        this.club_name = club_name;
        this.location = location;
        this.various_statictics = various_statictics;
        this.recieved_goals = recieved_goals;
        this.scored_goals = scored_goals;
        this.current_points = current_points;
        this.season = season;
        this.wins = wins;
        this.draws = draws;
        this.defearts = defearts;
        this.match_count = match_count;
    }

    public SportsClub(){

    }

//getters
    public String getClub_name() {
        return club_name;
    }

    public String getLocation() {
        return location;
    }

    public double getVarious_statictics() {
        return various_statictics;
    }

    public int getRecieved_goals() {
        return recieved_goals;
    }

    public int getScored_goals() {
        return scored_goals;
    }

    public int getCurrent_points() {
        return current_points;
    }

    public String getSeason() {
        return season;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefearts() {
        return defearts;
    }

    public int getMatch_count() {
        return match_count;
    }

//setters
    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setVarious_statictics(double various_statictics) {
        this.various_statictics = various_statictics;
    }

    public void setRecieved_goals(int recieved_goals) {
        this.recieved_goals = recieved_goals;
    }

    public void setScored_goals(int scored_goals) {
        this.scored_goals = scored_goals;
    }

    public void setCurrent_points(int current_points) {
        this.current_points = current_points;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setDefearts(int defearts) {
        this.defearts = defearts;
    }

    public void setMatch_count(int match_count) {
        this.match_count = match_count;
    }

    //to string method for print data
    @Override
    public String toString() {
        return club_name +
                location +
                various_statictics +
                recieved_goals +
                scored_goals +
                current_points +
                season +
                wins +
                draws +
                defearts +
                match_count ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsClub that = (SportsClub) o;
        return Double.compare(that.various_statictics, various_statictics) == 0 &&
                recieved_goals == that.recieved_goals &&
                scored_goals == that.scored_goals &&
                current_points == that.current_points &&
                wins == that.wins &&
                draws == that.draws &&
                defearts == that.defearts &&
                match_count == that.match_count &&
                Objects.equals(club_name, that.club_name) &&
                Objects.equals(location, that.location) &&
                Objects.equals(season, that.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club_name, location, various_statictics, recieved_goals, scored_goals, current_points, season, wins, draws, defearts, match_count);
    }


}