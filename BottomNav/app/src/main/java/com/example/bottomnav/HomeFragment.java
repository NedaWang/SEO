package com.example.bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private Button bt_steps;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        bt_steps = view.findViewById(R.id.bt_steps);
        bt_steps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getFragmentManager() in fragment
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CardsFragment()).commit();
            }
        });

        return view;
    }
}
