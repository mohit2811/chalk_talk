package com.example.lenovo.chalk_talk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.firebase.database.FirebaseDatabase;

public class Create_account extends AppCompatActivity {
    EditText name, dob, age, qualification, address, emailId, password, confirmPassword;
    RadioGroup gender;
    String names, dobs, ages, qualifications, saddress, genders, emailIds, passwords, confirmPasswords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learner_create_account);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        age = findViewById(R.id.age);
        qualification = findViewById(R.id.qualification);
        address = findViewById(R.id.address);
        gender = findViewById(R.id.gender_btn);
        emailId = findViewById(R.id.email_addr);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.password);

    }

    public void register(View view) {

        Intent i = new Intent(Create_account.this, Home_activity.class);
        startActivity(i);

        createaccount data = new createaccount(names, dobs, ages, qualifications, saddress, genders, emailIds, passwords, confirmPasswords);


        FirebaseDatabase database = FirebaseDatabase.getInstance();


          database.getReference().child("xsdgd").setValue(data);

    }


}
