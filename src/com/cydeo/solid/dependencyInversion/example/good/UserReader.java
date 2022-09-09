package com.cydeo.solid.dependencyInversion.example.good;

public class UserReader {
    private Reader reader;

    public UserReader(){
        this.reader=reader;
    }
    public String getUsername(){
        return "mikesmith";
    }

}
