package com.juiceberg.juiceberg.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.juiceberg.juiceberg.Interface.ItemClickListener;
import com.juiceberg.juiceberg.R;

/**
 * Created by darshan on 30/12/17.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    public TextView food_name;
    public TextView food_price;

    private ItemClickListener listener;



    public FoodViewHolder(View itemView) {
        super(itemView);

        food_name=(TextView)itemView.findViewById(R.id.food_name);

        itemView.setOnClickListener(this);

    }

    public void setListener(ItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v,getAdapterPosition(),false);

    }
}
