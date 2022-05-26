package com.example.applicationprojettest.covidApi;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.applicationprojettest.LoggedInActivity;
import com.example.applicationprojettest.R;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class MenuActivity extends AppCompatActivity {

    CircleMenu circleMenu ;
    ConstraintLayout constraintLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Hide action bar
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

        circleMenu =findViewById(R.id.circle_menu);
        constraintLayout = findViewById(R.id.constraint_layout);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.ic_baseline_menu_24, R.drawable.ic_baseline_cancel_24)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.ic_baseline_home_24   )
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.ic_baseline_search_24)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.ic_baseline_coronavirus_24)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.ic_baseline_settings_24)
                .addSubMenu(Color.parseColor("#FF6A00"),R.drawable.ic_baseline_contacts_24)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0 :
                                Intent i0 = new Intent(MenuActivity.this,MenuActivity.class);
                                startActivity(i0);
                                break;
                            case 1 :
                                Intent i1 = new Intent(MenuActivity.this,CountryWiseDataActivity.class);
                                startActivity(i1);
                                break;
                            case 2 :
                                Intent i2 = new Intent(MenuActivity.this,MainActivity.class);
                                startActivity(i2);
                                break;
                            case 3 :
                               // Intent i3 = new Intent(MenuActivity.this,MainActivity.class);
                               // startActivity(i3);
                                break;
                            case 4 :
                                Intent i4 = new Intent(MenuActivity.this, LoggedInActivity.class);
                                startActivity(i4);
                                break;
                        }
                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {}

            @Override
            public void onMenuClosed() {}

        });



    }
}