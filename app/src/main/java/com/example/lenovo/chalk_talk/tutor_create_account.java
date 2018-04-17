package com.example.lenovo.chalk_talk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;


public class tutor_create_account extends AppCompatActivity {

    EditText name, dob, age, specification, address, emailId, password, confirmPassword;
    RadioGroup gender;
    String names, dobs, ages, sspecification, saddress, genders, emailIds, passwords, confirmPasswords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_create_account);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        age = findViewById(R.id.age);
        specification = findViewById(R.id.specification);
        address = findViewById(R.id.address);
        gender = findViewById(R.id.gender_btn);
        emailId = findViewById(R.id.email_addr);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.password);

    }
    }


