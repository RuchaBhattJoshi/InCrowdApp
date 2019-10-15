package com.ruchajoshi.incrowdapp.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ruchajoshi.incrowdapp.R;
import com.ruchajoshi.incrowdapp.model.CommentaryEntries;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommentaryFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private CommentaryAdapter commentaryAdapter;
    private ArrayList<CommentaryEntries> commentaryEntries;

    public static Fragment newInstance(List<CommentaryEntries> commentaryEntries) {

        if (commentaryEntries == null) {
            throw new IllegalArgumentException("The Movies Data can not be null");
        }
        Bundle args = new Bundle();
        args.putSerializable("commentaryEntries", (Serializable) commentaryEntries);

        CommentaryFragment fragment = new CommentaryFragment();
        fragment.setArguments(args);
        return fragment;

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(getArguments()!=null){
            commentaryEntries = (ArrayList<CommentaryEntries>) getArguments().getSerializable("commentaryEntries");
            Log.i("0: fragment","-" +commentaryEntries.size());
            initAdapter(commentaryEntries);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_commentray, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.commaentary_recyclerview);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void initAdapter(ArrayList<CommentaryEntries> commentaryEntries) {
       // showNoReviews(false);
        Log.i("0: fragment init","-" +commentaryEntries.size());
        commentaryAdapter = new CommentaryAdapter(commentaryEntries);
        recyclerView.setAdapter(commentaryAdapter);
    }

}
