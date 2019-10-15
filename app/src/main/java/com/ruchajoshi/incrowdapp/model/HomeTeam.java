package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HomeTeam {


    @SerializedName("id")
    String homeId;

    @SerializedName("name")
    String homeName;

    @SerializedName("shortName")
    String homeShortName;

    @SerializedName("score")
    String homeScore;

    @SerializedName("halfTimeScore")
    String homeHalfTimeScore;

    @SerializedName("players")
    ArrayList<Players> homePlayers;

    @SerializedName("teamStats")
    TeamStats homeTeamStats;

    @SerializedName("imageUrl")
    String homeImageUrl;


    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHomeShortName() {
        return homeShortName;
    }

    public void setHomeShortName(String homeShortName) {
        this.homeShortName = homeShortName;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getHomeHalfTimeScore() {
        return homeHalfTimeScore;
    }

    public void setHomeHalfTimeScore(String homeHalfTimeScore) {
        this.homeHalfTimeScore = homeHalfTimeScore;
    }

    public List<Players> getHomePlayers() {
        return homePlayers;
    }

    public void setHomePlayers(List<Players> homePlayers) {
        this.homePlayers = (ArrayList<Players>) homePlayers;
    }

    public TeamStats getHomeTeamStats() {
        return homeTeamStats;
    }

    public void setHomeTeamStats(TeamStats homeTeamStats) {
        this.homeTeamStats = homeTeamStats;
    }

    public String getHomeImageUrl() {
        return homeImageUrl;
    }

    public void setHomeImageUrl(String homeImageUrl) {
        this.homeImageUrl = homeImageUrl;
    }
}
