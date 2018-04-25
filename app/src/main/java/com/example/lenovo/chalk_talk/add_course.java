package com.example.lenovo.chalk_talk;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class add_course extends Fragment{
    EditText course_name_et,course_id_et,course_duration_et;


    public add_course() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_add_course, container, false);
        return v;

    }
    public void add(View view) {
        course_name_et= view.findViewById(R.id.course_name_et);
        course_id_et= view.findViewById(R.id.course_id_et);
        course_duration_et= view.findViewById(R.id.course_duration_et);

    }

    public void add_vid(View view) {
    }
}
