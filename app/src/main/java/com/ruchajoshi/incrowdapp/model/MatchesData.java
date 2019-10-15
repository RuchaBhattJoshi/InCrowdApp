package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchesData {

    @SerializedName("id")
    String id;

    @SerializedName("feedMatchId")
    String feedMatchId;

    @SerializedName("competition")
    String competition;

    @SerializedName("competitionId")
    String competitionId;


    @SerializedName("status")
    String status;

    @SerializedName("period")
    String period;

    @SerializedName("seasonId")
    String seasonId;

    @SerializedName("season")
    String season;

    @SerializedName("round")
    String round;

    @SerializedName("minute")
    String minute;

    @SerializedName("attendance")
    String attendance;

    @SerializedName("date")
    String date;

    @SerializedName("homeTeam")
    HomeTeam homeTeam;

    @SerializedName("awayTeam")
    AwayTeam awayTeam;

    @SerializedName("venue")
    Venue venue;

    @SerializedName("events")
    List<Events> events;

    @SerializedName("officials")
    List<Officials> officials;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeedMatchId() {
        return feedMatchId;
    }

    public void setFeedMatchId(String feedMatchId) {
        this.feedMatchId = feedMatchId;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<Officials> getOfficials() {
        return officials;
    }

    public void setOfficials(List<Officials> officials) {
        this.officials = officials;
    }
}
