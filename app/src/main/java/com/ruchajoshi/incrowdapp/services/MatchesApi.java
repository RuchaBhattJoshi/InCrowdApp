package com.ruchajoshi.incrowdapp.services;

import com.ruchajoshi.incrowdapp.model.CommentaryResponse;
import com.ruchajoshi.incrowdapp.model.MatchesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {
    @GET("matches/987597")
    Call<MatchesResponse> getMatchesDetails();
}
