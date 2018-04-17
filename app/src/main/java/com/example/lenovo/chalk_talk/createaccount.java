package com.example.lenovo.chalk_talk;

/**
 * Created by lenovo on 03-Apr-18.
 */

public class createaccount {
    public String name,dob,age,qualification,address, gender,email_address,password, confirm_password;


    createaccount()
    {

    }


    createaccount(String name , String dob, String age, String qualification, String address, String gender, String email_address, String password, String confirm_password)

    {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.address= address;
        this.qualification= qualification;
        this.gender = gender;
        this.email_address= email_address;
        this.password= password;
        this.confirm_password= confirm_password;
    }
}
