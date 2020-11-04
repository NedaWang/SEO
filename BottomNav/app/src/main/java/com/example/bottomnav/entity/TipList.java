package com.example.bottomnav.entity;

import java.util.ArrayList;

public class TipList {
    public static ArrayList<Tip> getTips(){
        ArrayList<Tip> tips = new ArrayList<>();

        Tip tip1 = new Tip(1);
        tip1.setName("tip1");
        tips.add(tip1);

        Tip tip2 = new Tip(2);
        tip2.setName("tip2");
        tips.add(tip2);

        Tip tip3 = new Tip(3);
        tip3.setName("tip3");
        tips.add(tip3);

        Tip tip4 = new Tip(4);
        tip4.setName("tip4");
        tips.add(tip4);

        Tip tip5 = new Tip(5);
        tip5.setName("tip5");
        tips.add(tip5);

        return  tips;
    }
}
