package com.example.test;

public class LoginManager {

    public String getWholeName(String lastName, String firstName){
        return lastName + firstName;
    }

    public int getAge(int birthYear, int nowYear){
        return nowYear - birthYear + 1;
    }
}
