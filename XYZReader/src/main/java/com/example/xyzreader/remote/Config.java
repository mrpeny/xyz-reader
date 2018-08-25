package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    private static final String URL_ARTICLE =
            "https://go.udacity.com/xyz-reader-json";
    /*private static final String URL_ARTICLE =
            "https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json";*/

    static {
        URL url = null;
        try {
            url = new URL(URL_ARTICLE);
        } catch (MalformedURLException exception) {
            Log.e(TAG, "Invalid URL format: " + URL_ARTICLE + " Details: " + exception.getMessage());
        }
        BASE_URL = url;
    }
}
