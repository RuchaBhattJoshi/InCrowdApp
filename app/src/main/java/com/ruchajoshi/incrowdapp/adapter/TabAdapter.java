package com.ruchajoshi.incrowdapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.ruchajoshi.incrowdapp.fragments.CommentaryFragment;
import com.ruchajoshi.incrowdapp.fragments.EventsFragment;
import com.ruchajoshi.incrowdapp.fragments.StatsFragment;
import com.ruchajoshi.incrowdapp.model.CommentaryEntries;
import com.ruchajoshi.incrowdapp.model.MatchesResponse;

import java.util.ArrayList;

public class TabAdapter extends FragmentStatePagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"Events","Commentray" ,"Stats"};
    private FragmentManager fm;
    ArrayList<CommentaryEntries> commentList;
    MatchesResponse matchesResponse;

    public TabAdapter(FragmentManager fm, ArrayList<CommentaryEntries> commentList, MatchesResponse matchesResponse) {
        super(fm);
        this.fm=fm;
        this.commentList=commentList;
        this.matchesResponse=matchesResponse;
    }


    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EventsFragment();
            case 1:
                return  CommentaryFragment.newInstance(commentList);
            case 2:
                return StatsFragment.newInstance(matchesResponse);
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
