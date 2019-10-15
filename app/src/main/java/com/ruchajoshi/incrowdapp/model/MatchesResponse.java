package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MatchesResponse implements Serializable {

    @SerializedName("status")
    private String status;

    @SerializedName("data")
    @Expose
    private MatchesData matchesData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MatchesData getMatchesData() {
        return matchesData;
    }

    public void setMatchesData(MatchesData matchesData) {
        this.matchesData = matchesData;
    }
}
