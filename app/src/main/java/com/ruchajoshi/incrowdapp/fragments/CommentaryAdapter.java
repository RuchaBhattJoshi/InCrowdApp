package com.ruchajoshi.incrowdapp.fragments;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruchajoshi.incrowdapp.R;
import com.ruchajoshi.incrowdapp.model.CommentaryEntries;

import java.util.ArrayList;
import java.util.List;

class CommentaryAdapter extends RecyclerView.Adapter<CommentaryAdapter.CommentaryViewHolder> {

    private Context context;
    private ArrayList<CommentaryEntries> mCommaentrayList;


    public CommentaryAdapter(ArrayList<CommentaryEntries> commentaryEntries) {
        this.mCommaentrayList=commentaryEntries;
    }

    @Override
    public CommentaryViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        context = parent.getContext();
        View view = View.inflate(parent.getContext(), R.layout.commentry_row, null);
        return new CommentaryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CommentaryViewHolder viewHolder, int position) {
        Log.i("0: adapter","-" +mCommaentrayList.size());

        viewHolder.mCommentary.setText(mCommaentrayList.get(position).getComment());
        viewHolder.mCommentaryTime.setText(mCommaentrayList.get(position).getTime());
        Log.i("comment","comment"+mCommaentrayList.get(position).getComment());

    }

    @Override
    public int getItemCount() {
        return (mCommaentrayList!=null? mCommaentrayList.size():0);
    }


    public class CommentaryViewHolder extends RecyclerView.ViewHolder {

        private TextView mCommentary;
        private TextView mCommentaryTime;
        private ImageView mCommentaryImage;

        public CommentaryViewHolder(View itemView) {
            super(itemView);
            mCommentary = (TextView) itemView.findViewById(R.id.commentarytextView);
            mCommentaryTime = (TextView) itemView.findViewById(R.id.timetextView);
            //mCommentaryImage = (ImageView) itemView.findViewById(R.id.commentaryimage);


        }
    }
}
