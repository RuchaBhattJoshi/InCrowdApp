package com.ruchajoshi.incrowdapp.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruchajoshi.incrowdapp.R;
import com.ruchajoshi.incrowdapp.adapter.TabAdapter;
import com.ruchajoshi.incrowdapp.model.CommentaryEntries;
import com.ruchajoshi.incrowdapp.model.MatchesResponse;
import com.ruchajoshi.incrowdapp.model.TeamStats;
import com.ruchajoshi.incrowdapp.viewmodel.CommentrayViewModel;
import com.ruchajoshi.incrowdapp.viewmodel.MatchesViewModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewHomeTeam;
    private TextView mTextViewAwayTeam;

    private TextView mTextViewHomeScore;
    private TextView mTextViewAwayScore;

    private TextView mTextViewCompetitionName;
    private TextView mTextViewPeriodName;

    private ImageView mImageViewHomeTeamLogo;
    private ImageView mImageViewAwayTeamLogo;


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private TabAdapter mTabDetailsAdapter;

    CommentrayViewModel commentrayViewModel;
    ArrayList<CommentaryEntries> commentList= new ArrayList<>();

    MatchesViewModel matchesViewModel;
    ArrayList<TeamStats> teamStats= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        init();
        getData();



    }

    private void getData() {

        commentrayViewModel= ViewModelProviders .of(this).get(CommentrayViewModel.class);
        commentrayViewModel.init();
        commentrayViewModel.getCommentrayRepository().observe(this, commentary -> {

            List<CommentaryEntries> commentaries = commentary.getCommentaryData().getCommentaryEntries();
            commentList.addAll(commentaries);
            Log.i("mainactivity: size","-" +commentList.size());

        });

        matchesViewModel= ViewModelProviders .of(MainActivity.this).get(MatchesViewModel.class);
        matchesViewModel.init();
        matchesViewModel.getMatchesRepository().observe(MainActivity.this,matchesResponse -> {

            setupUI(matchesResponse);
            setupTabLayout(matchesResponse);
            //setupTabLayout();

        });


    }

    private void init() {

         mTextViewHomeTeam = findViewById(R.id.textView_hometeam);
         mTextViewAwayTeam= findViewById(R.id.textView_awayteam);

         mTextViewHomeScore= findViewById(R.id.textView_homescore);
         mTextViewAwayScore= findViewById(R.id.textView_awayscore);

         mTextViewCompetitionName= findViewById(R.id.textView_competitiontitle);
         mTextViewPeriodName= findViewById(R.id.textView_periodname);

         mImageViewHomeTeamLogo= findViewById(R.id.image_hometeam);
         mImageViewAwayTeamLogo= findViewById(R.id.image_awayteam);

    }

    private void setupUI(MatchesResponse matchesResponse) {

        mTextViewHomeTeam.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeName());
        mTextViewAwayTeam.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayName());

        mTextViewHomeScore.setText(matchesResponse.getMatchesData().getHomeTeam().getHomeScore());
        mTextViewAwayScore.setText(matchesResponse.getMatchesData().getAwayTeam().getAwayScore());

        mTextViewCompetitionName.setText(matchesResponse.getMatchesData().getCompetition());
        mTextViewPeriodName.setText(matchesResponse.getMatchesData().getPeriod());

        Picasso.get().load(matchesResponse.getMatchesData().getHomeTeam().getHomeImageUrl()).into(mImageViewHomeTeamLogo);
        Picasso.get().load(matchesResponse.getMatchesData().getAwayTeam().getAwayImageUrl()).into(mImageViewAwayTeamLogo);

    }

    private void setupTabLayout(MatchesResponse matchesResponse) {
        mTabDetailsAdapter = new TabAdapter(getSupportFragmentManager(),commentList,matchesResponse);
        //mTabDetailsAdapter = new TabAdapter(getSupportFragmentManager(),matchesResponse);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager.setOffscreenPageLimit(1);
        mViewPager.setAdapter(mTabDetailsAdapter);
        mViewPager.setCurrentItem(2);
        mTabLayout.setupWithViewPager(mViewPager);

    }

}
