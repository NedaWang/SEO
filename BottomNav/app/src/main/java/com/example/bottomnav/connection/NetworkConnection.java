package com.example.bottomnav.connection;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkConnection {

    private static final String BASE_URL =
            "http://10.0.2.2:8080/SEOGuide/webresources/";

    private OkHttpClient client = null;
    private String results;

    //public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public NetworkConnection(){
        client = new OkHttpClient();
    }

    public String getAllTips(){

        final String methodPath = "seotips.tips/";

        //String test = "http://10.0.2.2:8080/SEOGuide/webresources/seotips.tips/";

        Request.Builder builder = new Request.Builder();
        builder.url(BASE_URL + methodPath);
        //builder.url(test);
        Request request = builder.build();
        try {
            Response response = client.newCall(request).execute();
            results = response.body().string();
        }catch (Exception e){
            e.printStackTrace();
        }
        return results;
    }

}
