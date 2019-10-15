package com.ruchajoshi.incrowdapp.services;

import android.arch.lifecycle.MutableLiveData;
import com.ruchajoshi.incrowdapp.model.MatchesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchesRepository {

    private static MatchesRepository matchesRepository;


    public static MatchesRepository getInstance(){

        if(matchesRepository==null){
            matchesRepository= new MatchesRepository();
        }
        return matchesRepository;

    }

    private MatchesApi matchesApi;

    public MatchesRepository() {

        matchesApi= RetrofitService.createService(MatchesApi.class);
    }

    public MutableLiveData<MatchesResponse> getMatches(){

        MutableLiveData<MatchesResponse> matchesData = new MutableLiveData<>();
        matchesApi.getMatchesDetails().enqueue(new Callback<MatchesResponse>() {
            @Override
            public void onResponse(Call<MatchesResponse> call, Response<MatchesResponse> response) {
                if (response.isSuccessful()) {
                    matchesData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<MatchesResponse> call, Throwable t) {
                matchesData.setValue(null); }
        });

        return matchesData;
    }





}
