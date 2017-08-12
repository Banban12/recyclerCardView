package com.example.ban.resyclercardview;

/**
 * Created by Ban on 13/08/2017.
 */
public class Friend {

    private String name;
    private String job;
    private boolean gender;

    public Friend(String name, boolean gender, String job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public boolean isGender() {
        return gender;
    }
}
