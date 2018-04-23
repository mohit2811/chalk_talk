package com.example.lenovo.chalk_talk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class learner_home extends AppCompatActivity {

    private TextView mTextMessage;
    FragmentManager manager = getSupportFragmentManager();

    FragmentTransaction transaction = manager.beginTransaction();
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.all_courses:
                    course_learner learner = new course_learner();
                    transaction.replace(R.id.main_frame, learner);
                    transaction.commit();
                    return true;
                case R.id.course_opt:
                    course_opt opt = new course_opt();
                    transaction.replace(R.id.main_frame, opt);
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learner_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void drawer(View v) {
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.learner_drawer);
        mDrawerLayout.openDrawer(Gravity.LEFT);
    }

    public void user_profile(View view) {
        Intent i = new Intent(learner_home.this, learner_profile.class);
        startActivity(i);
    }

    public void home(View view) {
        course_learner learner = new course_learner();
        transaction.replace(R.id.main_frame, learner);
        transaction.commit();
    }

    public void setting(View view) {
        Intent i = new Intent(learner_home.this, settings.class);
        startActivity(i);
    }

    public void feedback(View view) {
        Intent i = new Intent(learner_home.this, feedback.class);
        startActivity(i);
    }

    public void logout(View view) {
        FirebaseAuth f_auth = FirebaseAuth.getInstance();
        f_auth.signOut();
        finish();
        startActivity(new Intent(this, learner_login.class));
    }

    public void search(View view) {
    }
}
