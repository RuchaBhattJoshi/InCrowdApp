package com.ruchajoshi.incrowdapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruchajoshi.incrowdapp.R;
import com.ruchajoshi.incrowdapp.model.MatchesResponse;
import com.ruchajoshi.incrowdapp.model.TeamStats;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class StatsFragment extends Fragment {

    MatchesResponse matchesResponse;

    private TextView mTextViewHomePossison;
    private TextView mTextViewAwayPossison;

    private TextView mTextViewHomeShots;
    private TextView mTextViewAwayShots;

    private ImageView mImageViewHomeTeamLogo1;
    private ImageView mImageViewHomeTeamLogo2;

    private ImageView mImageViewAwayTeamLogo1;
    private ImageView mImageViewAwayTeamLogo2;

    private TextView mTextViewHomeCorner;
    private TextView mTextViewAwayCorner;

    private TextView mTextViewHomeFreeKick;
    private TextView mTextViewAwayFreeKick;

    private TextView mTextViewHomeFoul;
    private TextView mTextViewAwayFoul;

   // private TextView mTextViewHomeRedcards;
   // private TextView mTextViewAwayRedcards;

    private TextView mTextViewHomeYellowcards;
    private TextView mTextViewAwayYellowcards;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stats, container, false);
    }

    public static Fragment newInstance(MatchesResponse matchesResponse ) {

        if (matchesResponse == null) {
            throw new IllegalArgumentException("The Movies Data can not be null");
        }
        Bundle args = new Bundle();
        args.putSerializable("matchesResponse", (Serializable) matchesResponse);

        StatsFragment fragment = new StatsFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(getArguments()!=null){
            matchesResponse = (MatchesResponse) getArguments().getSerializable("matchesResponse");
            setupUI(matchesResponse);
        }

    }

    private void setupUI(MatchesResponse matchesResponse ) {

        Picasso.get().load(matchesResponse.getMatchesData().getHomeTeam().getHomeImageUrl()).into(mImageViewHomeTeamLogo1);
        Picasso.get().load(matchesResponse.getMatchesData().getHomeTeam().getHomeImageUrl()).into(mImageViewHomeTeamLogo2);

        Picasso.get().load(matchesResponse.getMatchesData().getAwayTeam().getAwayImageUrl()).into(mImageViewAwayTeamLogo1);
        Picasso.get().load(matchesResponse.getMatchesData().getAwayTeam().getAwayImageUrl()).into(mImageViewAwayTeamLogo2);

        mTextViewHomeCorner.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getCornersTaken());
        mTextViewAwayCorner.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getCornersTaken());


        mTextViewHomeFreeKick.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getFreeKicksWon());
        mTextViewAwayFreeKick.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getFreeKicksWon());

        int homefreekicks = Integer.parseInt(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getFreeKicksConceded());
        //int homepenaties = Integer.parseInt(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getPenaltiesConceded());

        int homeFoul= homefreekicks; //+ homepenaties;

        int awayfreekicks = Integer.parseInt(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getFreeKicksConceded());
        int awaypenaties = Integer.parseInt(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getPenaltiesConceded());

        int awayFoul= awayfreekicks + awaypenaties;

        mTextViewHomeFoul.setText(Integer.toString(homeFoul));
        mTextViewAwayFoul.setText(Integer.toString(awayFoul));

        mTextViewHomeYellowcards.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getTeamYellowCards());
        mTextViewAwayYellowcards.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getTeamYellowCards());

        mTextViewHomePossison.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getPossession() + "%");
        mTextViewAwayPossison.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getPossession() + "%");


        mTextViewHomeShots.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getShotsOnGoal() + "(" + matchesResponse.getMatchesData().getHomeTeam().getHomeTeamStats().getShotsOnTarget()  + ")");
        mTextViewAwayShots.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getShotsOnGoal() + "(" + matchesResponse.getMatchesData().getAwayTeam().getAwayTeamStats().getShotsOnTarget()  + ")");

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTextViewHomePossison = view.findViewById(R.id.textView_hometeam1);
        mTextViewAwayPossison = view.findViewById(R.id.textView_awayteam1);

        mTextViewHomeShots = view.findViewById(R.id.textView_hometeam2);
        mTextViewAwayShots = view.findViewById(R.id.textView_awayteam2);


        mImageViewHomeTeamLogo1 = view.findViewById(R.id.image_hometeam1);
        mImageViewHomeTeamLogo2 = view.findViewById(R.id.image_hometeam2);

        mImageViewAwayTeamLogo1 = view.findViewById(R.id.image_awayteam1);
        mImageViewAwayTeamLogo2 = view.findViewById(R.id.image_awayteam2);

        mTextViewHomeCorner = view.findViewById(R.id.tv_homecorner);
        mTextViewAwayCorner = view.findViewById(R.id.tv_awaycorner);

        mTextViewHomeFreeKick = view.findViewById(R.id.tv_homefreekicks);
        mTextViewAwayFreeKick = view.findViewById(R.id.tv_awayfreekicks);

        mTextViewHomeFoul = view.findViewById(R.id.tv_homefouls);
        mTextViewAwayFoul = view.findViewById(R.id.tv_awayfouls);

       /* mTextViewHomeRedcards = view.findViewById(R.id.tv_homeredcards);
        mTextViewAwayRedcards = view.findViewById(R.id.tv_awayredcards);*/

        mTextViewHomeYellowcards = view.findViewById(R.id.tv_homeyellowcards);
        mTextViewAwayYellowcards = view.findViewById(R.id.tv_awayyellowcards);

    }



}
