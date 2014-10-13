package com.github.alexpolyansky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }
    public void onStartClick(View v){
        Intent intent = new Intent();
        setResult(RESULT_OK);
        finish();
    }
}
