package com.github.alexpolyansky.utils;
import com.github.alexpolyansky.MainActivity;
import com.github.alexpolyansky.constants.Constants;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
/**
 * Created by Алексей on 04.10.2014.
 */
public class DemoUtils  {
    private static boolean IS_FIRST = true;
    private static SharedPreferences sPref;
    public DemoUtils(SharedPreferences s) {
        sPref = s;
    }
    public DemoUtils() {
    }
    public boolean isFirstLaunch(){
       // sPref.getBoolean(Constants.FIRST, true);
        return IS_FIRST;
    }
    public void setFirstLaunch(boolean isFirst){
        IS_FIRST = isFirst;
        //Editor ed = sPref.edit();
        //ed.putBoolean(Constants.FIRST, IS_FIRST);
        //ed.commit();
    }
}
