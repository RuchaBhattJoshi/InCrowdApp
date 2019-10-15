package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamStats {

    @SerializedName("centreBoxShots")
    String centreBoxShots;

    @SerializedName("leftBoxShots")
    String leftBoxShots;

    @SerializedName("topRightGoals")
    String topRightGoals;

    @SerializedName("bottomRightGoals")
    String bottomRightGoals;

    @SerializedName("insideBoxBlocks")
    String insideBoxBlocks;

    @SerializedName("insideBoxGoals")
    String insideBoxGoals;

    @SerializedName("insideBoxGoalkeeperSaves")
    String insideBoxGoalkeeperSaves;

    @SerializedName("cornersTaken")
    String cornersTaken;

    @SerializedName("freeKicksWon")
    String freeKicksWon;

    @SerializedName("teamYellowCards")
    String teamYellowCards;

    @SerializedName("possession")
    String possession;

    @SerializedName("shotsOnGoal")
    String shotsOnGoal;

    @SerializedName("shotsOffTarget")
    String shotsOffTarget;

    @SerializedName("shotsOnTarget")
    String shotsOnTarget;

    @SerializedName("freeKicksConceded")
    String freeKicksConceded;

    @SerializedName("penaltiesConceded")
    String penaltiesConceded;


    public String getShotsOnTarget() {
        return shotsOnTarget;
    }

    public void setShotsOnTarget(String shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    public String getFreeKicksConceded() {
        return freeKicksConceded;
    }

    public void setFreeKicksConceded(String freeKicksConceded) {
        this.freeKicksConceded = freeKicksConceded;
    }

    public String getPenaltiesConceded() {
        return penaltiesConceded;
    }

    public void setPenaltiesConceded(String penaltiesConceded) {
        this.penaltiesConceded = penaltiesConceded;
    }

    public String getCornersTaken() {
        return cornersTaken;
    }

    public void setCornersTaken(String cornersTaken) {
        this.cornersTaken = cornersTaken;
    }

    public String getFreeKicksWon() {
        return freeKicksWon;
    }

    public void setFreeKicksWon(String freeKicksWon) {
        this.freeKicksWon = freeKicksWon;
    }

    public String getTeamYellowCards() {
        return teamYellowCards;
    }

    public void setTeamYellowCards(String teamYellowCards) {
        this.teamYellowCards = teamYellowCards;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public String getShotsOnGoal() {
        return shotsOnGoal;
    }

    public void setShotsOnGoal(String shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public String getShotsOffTarget() {
        return shotsOffTarget;
    }

    public void setShotsOffTarget(String shotsOffTarget) {
        this.shotsOffTarget = shotsOffTarget;
    }

    public String getCentreBoxShots() {
        return centreBoxShots;
    }

    public void setCentreBoxShots(String centreBoxShots) {
        this.centreBoxShots = centreBoxShots;
    }

    public String getLeftBoxShots() {
        return leftBoxShots;
    }

    public void setLeftBoxShots(String leftBoxShots) {
        this.leftBoxShots = leftBoxShots;
    }

    public String getTopRightGoals() {
        return topRightGoals;
    }

    public void setTopRightGoals(String topRightGoals) {
        this.topRightGoals = topRightGoals;
    }

    public String getBottomRightGoals() {
        return bottomRightGoals;
    }

    public void setBottomRightGoals(String bottomRightGoals) {
        this.bottomRightGoals = bottomRightGoals;
    }

    public String getInsideBoxBlocks() {
        return insideBoxBlocks;
    }

    public void setInsideBoxBlocks(String insideBoxBlocks) {
        this.insideBoxBlocks = insideBoxBlocks;
    }

    public String getInsideBoxGoals() {
        return insideBoxGoals;
    }

    public void setInsideBoxGoals(String insideBoxGoals) {
        this.insideBoxGoals = insideBoxGoals;
    }

    public String getInsideBoxGoalkeeperSaves() {
        return insideBoxGoalkeeperSaves;
    }

    public void setInsideBoxGoalkeeperSaves(String insideBoxGoalkeeperSaves) {
        this.insideBoxGoalkeeperSaves = insideBoxGoalkeeperSaves;
    }
}
