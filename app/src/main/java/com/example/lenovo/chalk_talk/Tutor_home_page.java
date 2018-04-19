package com.example.lenovo.chalk_talk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Tutor_home_page extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.course_opt:
                    Toast.makeText(Tutor_home_page.this,"course opted",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.all_courses:
                    Toast.makeText(Tutor_home_page.this,"course opted",Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_home_page);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void home(View view) {
        Intent i = new Intent(Tutor_home_page.this,Tutor_home_page.class);
        startActivity(i);
    }


    public void tutor_profile(View view) {
        Intent i = new Intent(Tutor_home_page.this,Tutor_profile.class);
        startActivity(i);
    }

    public void tutor_settings(View view) {
        Intent i = new Intent(Tutor_home_page.this,tutor_setting.class);
        startActivity(i);
    }

    public void upload(View view) {

    }

    public void profile(View view) {
        Intent i = new Intent(Tutor_home_page.this,learner_profile.class);
        startActivity(i);
    }
}

