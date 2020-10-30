package com.example.bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TipDetailFragment extends Fragment {

    private TextView tv_tip_name;
    private TextView tv_tip_description;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tip_detail, container, false);

        tv_tip_name = view.findViewById(R.id.tip_name);
        tv_tip_description = view.findViewById(R.id.tip_description);

        return view;
    }
}
