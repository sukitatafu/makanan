package com.splash.billy.makanan;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Billy on 16/01/2018.
 */

public class NetworkHelper {
    public static boolean hasNetworkAccess (Context context){

        ConnectivityManager cm = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        try{
            NetworkInfo activeNetwork =cm.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
