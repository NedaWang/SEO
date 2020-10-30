package com.example.bottomnav;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnav.connection.NetworkConnection;
import com.example.bottomnav.entity.Tip;
import com.example.bottomnav.adapter.CardAdapter;
import com.example.bottomnav.util.FormatConvert;

import java.util.ArrayList;

public class CardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private CardAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    NetworkConnection networkConnection;
    ArrayList<Tip> tips;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cards, container, false);

        ArrayList<Tip> test = new ArrayList<>();
        test.add(new Tip(1,"Site Verification1"));
        test.add(new Tip(2,"Site Verification2"));
        test.add(new Tip(3,"Site Verification3"));


        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());

        networkConnection = new NetworkConnection();


        GetAllTipsTask getAllTipsTask = new GetAllTipsTask();
        getAllTipsTask.execute();


        return view;
    }

    private class GetAllTipsTask extends AsyncTask<Void,Void,String>{

        @Override
        protected String doInBackground(Void... voids) {
            Log.d("TAG", "doInBackground: ");
            return networkConnection.getAllTips();
        }

        @Override
        protected void onPostExecute(String s) {
            //Toast.makeText(getActivity(),s,Toast.LENGTH_SHORT).show();
            Log.d("onPostExecute",s.length()+"");

            tips = FormatConvert.stringToTips(s);
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Tips", Context.MODE_PRIVATE);


            adapter = new CardAdapter(tips);

            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);

            adapter.setOnItemClickListener(new CardAdapter.OnItemClickListener() {
                @Override
                public void onItemCLick(int position) {
                    //tips.get(position) // get the related item entity object
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new TipDetailFragment()).commit();
                }
            });

        }
    }
}
