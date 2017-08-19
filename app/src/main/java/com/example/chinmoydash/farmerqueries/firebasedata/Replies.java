package com.example.chinmoydash.farmerqueries.firebasedata;

/**
 * Created by chinmoydash on 18/08/17.
 */

public class Replies {

    public String  name, message;

    public Replies(String name, String message) {

        this.name = name;
        this.message = message;
    }

    public Replies() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
