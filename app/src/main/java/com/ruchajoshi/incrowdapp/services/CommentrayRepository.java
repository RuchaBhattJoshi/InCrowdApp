package com.ruchajoshi.incrowdapp.services;

import android.arch.lifecycle.MutableLiveData;

import com.ruchajoshi.incrowdapp.model.CommentaryResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommentrayRepository {

    private static CommentrayRepository commentrayRepository;


    public static CommentrayRepository getInstance(){

        if(commentrayRepository==null){
            commentrayRepository= new CommentrayRepository();
        }
        return commentrayRepository;

    }

    private CommentaryApi commentaryApi;

    public CommentrayRepository () {

        commentaryApi= RetrofitService.createService(CommentaryApi.class);
    }

    public MutableLiveData<CommentaryResponse> getCommentry(){

        MutableLiveData<CommentaryResponse> commentryData = new MutableLiveData<>();
        commentaryApi.getCommantaries().enqueue(new Callback<CommentaryResponse>() {
            @Override
            public void onResponse(Call<CommentaryResponse> call, Response<CommentaryResponse> response) {
                if (response.isSuccessful()) {
                    commentryData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<CommentaryResponse> call, Throwable t) {
                commentryData.setValue(null); }
        });

        return commentryData;
    }





}
