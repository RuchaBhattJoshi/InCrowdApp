package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

public class Events {

    @SerializedName("time")
    String time;

    @SerializedName("type")
    String type;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
