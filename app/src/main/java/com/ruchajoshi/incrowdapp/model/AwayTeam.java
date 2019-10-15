package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AwayTeam {

    @SerializedName("id")
    String awayId;

    @SerializedName("name")
    String awayName;

    @SerializedName("shortName")
    String awayShortName;

    @SerializedName("score")
    String awayScore;

    @SerializedName("halfTimeScore")
    String awayHalfTimeScore;

    @SerializedName("players")
    List<Players> awayPlayers;

    @SerializedName("teamStats")
    TeamStats awayTeamStats;

    @SerializedName("imageUrl")
    String awayImageUrl;


    public String getAwayId() {
        return awayId;
    }

    public void setAwayId(String awayId) {
        this.awayId = awayId;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    public String getAwayShortName() {
        return awayShortName;
    }

    public void setAwayShortName(String awayShortName) {
        this.awayShortName = awayShortName;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getAwayHalfTimeScore() {
        return awayHalfTimeScore;
    }

    public void setAwayHalfTimeScore(String awayHalfTimeScore) {
        this.awayHalfTimeScore = awayHalfTimeScore;
    }

    public List<Players> getAwayPlayers() {
        return awayPlayers;
    }

    public void setAwayPlayers(List<Players> awayPlayers) {
        this.awayPlayers = awayPlayers;
    }

    public TeamStats getAwayTeamStats() {
        return awayTeamStats;
    }

    public void setAwayTeamStats(TeamStats awayTeamStats) {
        this.awayTeamStats = awayTeamStats;
    }

    public String getAwayImageUrl() {
        return awayImageUrl;
    }

    public void setAwayImageUrl(String awayImageUrl) {
        this.awayImageUrl = awayImageUrl;
    }
}
