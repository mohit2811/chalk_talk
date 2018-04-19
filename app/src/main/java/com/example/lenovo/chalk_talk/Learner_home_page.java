package com.example.lenovo.chalk_talk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Learner_home_page extends AppCompatActivity {

    private TextView mTextMessage;

/*
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.add_course:
                    Toast.makeText(Learner_home_page.this,"add course",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.all_courses:
                    Toast.makeText(Learner_home_page.this,"All courses",Toast.LENGTH_SHORT).show();
                    return true;


            }
            return false;
        }
    };
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learner_home_page);

        mTextMessage = (TextView) findViewById(R.id.message);
       BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
       // navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        BottomNavigationView.OnNavigationItemReselectedListener listener = new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item)
            {  if(item.getItemId() == R.id.all_courses)
            {
                FragmentManager manager = getSupportFragmentManager();

                FragmentTransaction transaction = manager.beginTransaction();

                Course_learner learner = new Course_learner();

                transaction.replace(R.id.main_frame,learner);

                transaction.commit();
            }

            }
        };

        navigation.setOnNavigationItemReselectedListener(listener);

    }
    public void home(View view) {
        Intent i = new Intent(Learner_home_page.this,Learner_home_page.class);
        startActivity(i);
    }

    public void user_profile(View view) {

    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.search, menu);

            return true;
        }

    public void feedback(View view) {
       Intent i = new Intent(Learner_home_page.this,feedback.class);
       startActivity(i);
    }

    public void setting(View view) {
        Intent i = new Intent (Learner_home_page.this,settings.class);
        startActivity(i);
    }

    public void logout(View view) {

    }
}

