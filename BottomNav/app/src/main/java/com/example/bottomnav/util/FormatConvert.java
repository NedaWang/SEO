package com.example.bottomnav.util;

import com.example.bottomnav.entity.Tip;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;

public class FormatConvert {

    public static ArrayList<Tip> stringToTips(String s) {
        ArrayList<Tip> tips = new ArrayList<Tip>();
        Tip tip = null;
        JsonArray jsons = new JsonParser().parse(s).getAsJsonArray();
        for (JsonElement e : jsons) {
            JsonObject j = e.getAsJsonObject();
            tip = new Tip();
            tip.setId(j.get("id").getAsInt());
            tip.setName(j.get("name").getAsString());
            tip.setDescription(j.get("description").getAsString());
            tip.setHow(j.get("how").getAsString());
            tip.setWhy(j.get("why").getAsString());
            //tip.setImage(j.get("image").getAsString());
            //tip.setVideo(j.get("video").getAsString());

            tips.add(tip);
        }
        return tips;
    }
}
