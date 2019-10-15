package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CommentaryResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("data")
    @Expose
    private CommentaryData commentaryData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CommentaryData getCommentaryData() {
        return commentaryData;
    }

    public void setCommentaryData(CommentaryData commentaryData) {
        this.commentaryData = commentaryData;
    }


}
