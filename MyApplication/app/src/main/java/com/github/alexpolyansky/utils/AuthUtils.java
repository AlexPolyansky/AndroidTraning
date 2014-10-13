package com.github.alexpolyansky.utils;
import android.app.Activity;
import android.content.SharedPreferences;
import com.github.alexpolyansky.constants.Constants;
/**
 * Created by Алексей on 03.10.2014.
 */
public class AuthUtils {
    private static boolean IS_LOGGED = false;
    private static SharedPreferences sPref;
    public AuthUtils(SharedPreferences s){
        sPref = s;
    }
    public AuthUtils(){

    }
    public boolean isLogged(){
        //sPref.getBoolean(Constants.LOGGED, false);
        return IS_LOGGED;
    }
    public void setLogged(boolean isLogged) {
        IS_LOGGED = isLogged;
       // SharedPreferences.Editor ed = sPref.edit();
      //  ed.putBoolean(Constants.LOGGED, IS_LOGGED);
       // ed.commit();
    }
}
