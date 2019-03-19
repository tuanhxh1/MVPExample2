package com.example.tuan.mvpexample2.model.entity;

public class Demo {
    private String mMessage;

    public Demo(String message) {
        mMessage = message;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    @Override
    public String toString() {
        return "Demo{ " +
                "message='" + mMessage + '\'' +
                '}';
    }
}
