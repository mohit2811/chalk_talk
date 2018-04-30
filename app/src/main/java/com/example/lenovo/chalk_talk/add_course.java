package com.example.lenovo.chalk_talk;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.chalk_talk.dataModel.course_details;
import com.example.lenovo.chalk_talk.dataModel.createaccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class add_course extends Fragment {
    EditText course_name_et, course_id_et, course_category_et, course_duration_et;

    Button add_btn, vidd;

    String scourse_id_et;


    public add_course() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_add_course, container, false);

        add_btn = v.findViewById(R.id.add_btn);
        vidd = v.findViewById(R.id.vidd);
        course_name_et = v.findViewById(R.id.course_name_et);
        course_id_et = v.findViewById(R.id.course_id_et);
        course_duration_et = v.findViewById(R.id.course_duration_et);
        course_category_et = v.findViewById(R.id.course_category_et);
        vidd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), course_vidd.class);

                i.putExtra("course_id", scourse_id_et);

                startActivity(i);
            }
        });
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String scourse_name_et = course_name_et.getText().toString();
                scourse_id_et = course_id_et.getText().toString();
                String scourse_duration_et = course_duration_et.getText().toString();
                String scourse_category_et = course_category_et.getText().toString();

                FirebaseAuth f = FirebaseAuth.getInstance();
                String namet = f.getCurrentUser().getDisplayName();
                System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4" + namet);
                course_details data = new course_details(scourse_name_et, scourse_id_et, scourse_duration_et, "mohit", scourse_category_et);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                String emaill = f.getCurrentUser().getEmail().replace(".", "");

                database.getReference().child("course").child(scourse_category_et).child(emaill).child(String.valueOf(scourse_id_et)).setValue(data);
            }
        });


        return v;

    }
}
