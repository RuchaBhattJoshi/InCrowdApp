package com.ruchajoshi.incrowdapp.model;

import com.google.gson.annotations.SerializedName;

public class Venue {

    @SerializedName("id")
    String id;

    @SerializedName("name")
    String name;

    @SerializedName("location")
    String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
