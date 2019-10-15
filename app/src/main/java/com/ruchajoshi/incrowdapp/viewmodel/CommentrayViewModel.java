package com.ruchajoshi.incrowdapp.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ruchajoshi.incrowdapp.model.CommentaryResponse;
import com.ruchajoshi.incrowdapp.services.CommentrayRepository;

public class CommentrayViewModel extends ViewModel {

    private MutableLiveData<CommentaryResponse> mutableLiveData;
    private CommentrayRepository commentrayRepository;


    public void init(){

        if(mutableLiveData !=null){
            return;
        }

        commentrayRepository = CommentrayRepository.getInstance();
        mutableLiveData = commentrayRepository.getCommentry();
    }

   public LiveData<CommentaryResponse> getCommentrayRepository(){
        return mutableLiveData;
      }

}
