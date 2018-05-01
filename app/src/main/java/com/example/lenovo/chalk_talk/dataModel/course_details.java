package com.example.lenovo.chalk_talk.dataModel;

/**
 * Created by lenovo on 03-Apr-18.
 */

public class course_details {
    public String course_name,course_id,courseduration,type,tutorname,course_category;

    course_details()
    {

    }

    public course_details(String course_name,String course_id,String type,String courseduration,String tutorname,String course_category)

    {
        this.course_id = course_id;
        this.course_name = course_name;
        this.courseduration= courseduration;
        this.tutorname= tutorname;
        this.type=type;
        this.course_category =course_category;

    }
}
