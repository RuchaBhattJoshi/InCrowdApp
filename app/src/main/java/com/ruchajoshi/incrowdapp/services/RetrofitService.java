package com.ruchajoshi.incrowdapp.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://feeds.incrowdsports.com/provider/opta/football/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static <S> S createService(Class<S> serviceclass){
        return retrofit.create(serviceclass);
    }

}
