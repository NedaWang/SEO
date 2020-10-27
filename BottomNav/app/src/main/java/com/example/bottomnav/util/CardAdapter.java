package com.example.bottomnav.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnav.R;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        public TextView id;
        public TextView name;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.tip_id);
            name = itemView.findViewById(R.id.tip_name);
        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent,false);
        CardViewHolder cardViewHolder = new CardViewHolder(v);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
