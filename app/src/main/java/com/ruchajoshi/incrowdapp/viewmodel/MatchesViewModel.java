package com.ruchajoshi.incrowdapp.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ruchajoshi.incrowdapp.model.MatchesResponse;
import com.ruchajoshi.incrowdapp.services.MatchesRepository;

public class MatchesViewModel extends ViewModel {

    private MutableLiveData<MatchesResponse> mutableLiveData;
    private MatchesRepository matchesRepository;


    public void init(){

        if(mutableLiveData !=null){
            return;
        }

        matchesRepository = MatchesRepository.getInstance();
        mutableLiveData = matchesRepository.getMatches();
    }

   public LiveData<MatchesResponse> getMatchesRepository(){
        return mutableLiveData;
      }

}
