package com.ruchajoshi.incrowdapp.services;

import com.ruchajoshi.incrowdapp.model.CommentaryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CommentaryApi {
    @GET("matches/987597/commentary")
    Call<CommentaryResponse> getCommantaries();
}
