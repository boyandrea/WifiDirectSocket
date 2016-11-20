package com.example.android.wifidirect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/**
 * Created by irfansp on 10/20/16.
 */

public class SharePref {

    SharedPreferences sharedPreferences;
    Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    public static final String myPref = "myPref";
    public static final String isLogin = "IsLoggedIn";
    public static final String IP_A = "IP_A";
    public static final String Token = "Token";

    public SharePref(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(myPref,PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void saveLogin (){
        editor.putBoolean(isLogin,true);
        editor.commit();
    }

    public void saveToken(String token){
        editor.putString(Token,token);
        editor.commit();
    }

    public void saveA (String ipA){
        editor.putString(IP_A,ipA);
        editor.commit();
    }

    public void setLogout(){
        editor.clear();
        editor.commit();
    }

    public String getIP_A(){
        return sharedPreferences.getString(IP_A,null);
    }

    public String getToken(){
        return sharedPreferences.getString(Token,null);
    }


    public boolean isLoggedIn(){
        return sharedPreferences.getBoolean(isLogin, false);
    }


}
