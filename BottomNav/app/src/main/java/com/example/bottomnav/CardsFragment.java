package com.example.bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnav.entity.Tip;

import java.util.ArrayList;

public class CardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ArrayList<Tip> tips = new ArrayList<>();
        tips.add(new Tip(1,"Site Verification1"));
        tips.add(new Tip(2,"Site Verification2"));
        tips.add(new Tip(3,"Site Verification3"));


        return inflater.inflate(R.layout.fragment_cards, container, false);
    }
}
