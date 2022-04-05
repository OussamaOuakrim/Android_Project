package com.addition.simpleapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;

import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;

// Ait Ouakrim Oussama Semaine 2

public class LoadingScreenActivity extends AppCompatActivity {

    private static final long LOADING_SCREEN_TIMEOUT = 2000;
    
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(LoadingScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, LOADING_SCREEN_TIMEOUT);
    }
    public void ShowDialog(Context context) {
        
        progressDialog = new ProgressDialog(context);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    public void DismissDialog() {
        progressDialog.dismiss();
    }
}
