package com.example.doctors.models;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int room;
    private String position;
    private String image;

    public Person(String name, int room, String position, String image){
        this.name = name;
        this.room = room;
        this.position = position;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
