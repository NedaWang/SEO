package com.example.bottomnav.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnav.R;
import com.example.bottomnav.entity.Tip;

import java.util.ArrayList;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    public ArrayList<Tip> tips;
    private OnItemClickListener listener;


    public interface OnItemClickListener{
        void onItemCLick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        public TextView tv_id;
        public TextView tv_name;
        public CardViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tip_id);
            tv_name = itemView.findViewById(R.id.tip_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemCLick(position);
                        }
                    }
                }
            });
        }
    }

    public CardAdapter(ArrayList<Tip> tips){
        this.tips = tips;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent,false);
        CardViewHolder cardViewHolder = new CardViewHolder(v, listener);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Tip currentTip = tips.get(position);
        holder.tv_id.setText(currentTip.getId()+"");
        holder.tv_name.setText(currentTip.getName());
    }

    @Override
    public int getItemCount() {
        return tips.size();
    }

}
