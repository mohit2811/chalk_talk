package com.example.lenovo.chalk_talk;

/**
 * Created by lenovo on 12-Apr-18.
 */

public class tutor_createaccount {
    public String name,dob,age,specification,address, gender,email_address,password, confirm_password;

    tutor_createaccount()
    {

    }


    tutor_createaccount(String name , String dob, String age, String specification, String address, String gender, String email_address, String password, String confirm_password)

    {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.address= address;
        this.specification= specification;
        this.gender = gender;
        this.email_address= email_address;
        this.password= password;
        this.confirm_password= confirm_password;
    }
}

