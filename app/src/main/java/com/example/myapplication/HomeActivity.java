package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.ui.viewpage.viewpage1;
import com.example.myapplication.ui.viewpage.viewpage2;
import com.example.myapplication.ui.viewpage.viewpage3;
import com.example.myapplication.ui.viewpage.viewpage4;
import com.example.myapplication.ui.viewpage.viewpage5;
import com.example.myapplication.ui.viewpage.viewpage6;
import com.example.myapplication.ui.viewpage.viewpage7;
import com.example.myapplication.ui.viewpage.viewpage8;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        View toolbar = findViewById(R.id.toolbar);
        setSupportActionBar((Toolbar) toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);//기본 제목을 없애줍니다.
        actionBar.setDisplayHomeAsUpEnabled(true);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,  R.id.navigation_chatting)
                .build();


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager() .findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        Button button1,button2,button3,button4,button5,button6,button7,button8;

        button1 = (Button) findViewById(R.id.button1) ;
        button2 = (Button) findViewById(R.id.button2) ;
        button3 = (Button) findViewById(R.id.button3) ;
        button4 = (Button) findViewById(R.id.button4) ;
        button5 = (Button) findViewById(R.id.button5) ;
        button6 = (Button) findViewById(R.id.button6) ;
        button7 = (Button) findViewById(R.id.button7) ;
        button8 = (Button) findViewById(R.id.button8) ;


        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button1:
                        Intent intent = new Intent(HomeActivity.this , viewpage1.class);
                        startActivity(intent);
                        break;

                    case R.id.button2:
                        Intent intent2 = new Intent(HomeActivity.this , viewpage2.class);
                        startActivity(intent2);
                        break;

                    case R.id.button3:
                        Intent intent3 = new Intent(HomeActivity.this , viewpage3.class);
                        startActivity(intent3);
                        break;
                    case R.id.button4:
                        Intent intent4 = new Intent(HomeActivity.this , viewpage4.class);
                        startActivity(intent4);
                        break;
                    case R.id.button5:
                        Intent intent5 = new Intent(HomeActivity.this , viewpage5.class);
                        startActivity(intent5);
                        break;
                    case R.id.button6:
                        Intent intent6 = new Intent(HomeActivity.this , viewpage6.class);
                        startActivity(intent6);
                        break;
                    case R.id.button7:
                        Intent intent7 = new Intent(HomeActivity.this , viewpage7.class);
                        startActivity(intent7);
                        break;
                    case R.id.button8:
                        Intent intent8 = new Intent(HomeActivity.this , viewpage8.class);
                        startActivity(intent8);
                        break;



                }

            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);












    }

}