package com.example.navendu.final2018.Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navendu.final2018.Models.EngiTeamModel;
import com.example.navendu.final2018.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Chiller on 31-12-2017.
 */

public class EngiTeamAdapter extends RecyclerView.Adapter<EngiTeamAdapter.EngiTeamViewHolder> {
    public ArrayList<EngiTeamModel> mList;
    Context mContext;
    public void setData(ArrayList<EngiTeamModel> list,Context context)
    {
        this.mList=list;
        this.mContext=context;
//        Log.v("EngiAdapt",mList.get(0).imageName);
    }
    @Override
    public EngiTeamAdapter.EngiTeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.engiteam_item, parent, false);

        return new EngiTeamViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EngiTeamAdapter.EngiTeamViewHolder holder, int position) {
        EngiTeamModel item = mList.get(position);
        holder.name.setText(item.name);
        holder.position.setText(item.position);
        Resources resources = mContext.getResources();
        Log.v("EngiTeamAdapt",String.valueOf(position));
        final int resourceId = resources.getIdentifier(item.imageName, "drawable",
                mContext.getPackageName());
       // Drawable toShow=  resources.getDrawable(resourceId);
        Picasso.with(mContext)
                .load(resourceId)
                .placeholder( R.drawable.progress_animation )
                .resize(300,300)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class EngiTeamViewHolder extends RecyclerView.ViewHolder {
        public TextView name,position;
        public ImageView image;

        public EngiTeamViewHolder(View view) {
            super(view);
            name = (TextView)view.findViewById(R.id.tt1);
            position=(TextView) view.findViewById(R.id.tt2);
            image=(ImageView) view.findViewById(R.id.ii1);

        }
    }
}
