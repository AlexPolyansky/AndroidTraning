package com.github.alexpolyansky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.github.alexpolyansky.constants.Constants;
import com.github.alexpolyansky.utils.AuthUtils;
import com.github.alexpolyansky.utils.DemoUtils;

/**
 * Created by Алексей on 03.10.2014.
 */
public class SearchActiviy extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent i = new Intent();
        i.getAction();
        String s = null;
        search(s);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
    void search(String s){

    }
}
