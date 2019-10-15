package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentaryData {


    @SerializedName("homeTeamName")
    private String homeTeamName;

    @SerializedName("homeTeamId")
    private String homeTeamId;

    @SerializedName("homeScore")
    private String homeScore;

    @SerializedName("awayTeamName")
    private String awayTeamName;

    @SerializedName("awayTeamId")
    private String awayTeamId;

    @SerializedName("awayScore")
    private String awayScore;

    @SerializedName("competition")
    private String competition;

    @SerializedName("commentaryEntries")
    private List<CommentaryEntries> commentaryEntries;

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public List<CommentaryEntries> getCommentaryEntries() {
        return commentaryEntries;
    }

    public void setCommentaryEntries(List<CommentaryEntries> commentaryEntries) {
        this.commentaryEntries = commentaryEntries;
    }
}
