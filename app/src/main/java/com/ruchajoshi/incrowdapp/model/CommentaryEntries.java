package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CommentaryEntries implements Serializable {

    @SerializedName("type")
    private String type;

    @SerializedName("comment")
    private String comment;

    @SerializedName("time")
    private String time;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
