package com.android.listview;

public class User {

    String phoneNo, lastMessage, lastMsgTime, name, country;
    int imageId;

    public User(String phoneNo, String lastMessage, String lastMsgTime, String name, String country, int imageId) {
        this.phoneNo = phoneNo;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.name = name;
        this.country = country;
        this.imageId = imageId;
    }
}