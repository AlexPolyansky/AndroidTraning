package com.github.alexpolyansky;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import com.github.alexpolyansky.constants.Constants;
import com.github.alexpolyansky.utils.AuthUtils;
import com.github.alexpolyansky.utils.DemoUtils;

/**
 * Created by Алексей on 03.10.2014.
 */
public class StartActiviy extends Activity {
    private AuthUtils aUtils;
    private DemoUtils dUtils;
    //private SharedPreferences sPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sPref = this.getPreferences(MODE_PRIVATE);
        aUtils = new AuthUtils();
        dUtils = new DemoUtils();
       // aUtils = new AuthUtils(sPref);
       // dUtils = new DemoUtils(sPref);
        switchActivity();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Constants.FIRST_LAUNCH && resultCode == RESULT_OK ){
            dUtils.setFirstLaunch(false);
            switchActivity();
        }else if(requestCode == Constants.SUCCESS && resultCode == RESULT_OK ){
            aUtils.setLogged(true);
            startMain();
        }else{
            finish();
        }
    }
    public void startMain(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
    public void switchActivity(){
        if(dUtils.isFirstLaunch()){
            startActivityForResult(new Intent(this, DemoActivity.class), Constants.FIRST_LAUNCH);
           // finish();
        }else if(!aUtils.isLogged()){
            startActivityForResult(new Intent(this, LoginActivity.class), Constants.SUCCESS);
            //finish();
        }else{
            startMain();
        }
    }
}
