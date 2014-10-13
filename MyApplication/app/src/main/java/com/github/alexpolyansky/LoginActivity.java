package com.github.alexpolyansky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends Activity implements TextView.OnEditorActionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText editGo = (EditText) findViewById(R.id.password_edt);
        editGo.setOnEditorActionListener(this);
    }
    public void onStart(View v){
        startActivity(new Intent(this, MainActivityTwo.class));
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_GO) {
            onStart(v);
            return true;
        }
        return false;
    }
}
