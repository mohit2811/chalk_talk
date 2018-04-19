package com.example.lenovo.chalk_talk.dataModel;

/**
 * Created by lenovo on 03-Apr-18.
 */

public class createaccount {
    public String name,dob,qualification,address, gender,email_address,password, confirm_password;


    createaccount()
    {

    }


    public createaccount(String name, String dob, String qualification, String address, String gender, String email_address, String password, String confirm_password)

    {
        this.name = name;
        this.dob = dob;
        this.address= address;
        this.qualification= qualification;
        this.gender = gender;
        this.email_address= email_address;
        this.password= password;
        this.confirm_password= confirm_password;
    }
}
