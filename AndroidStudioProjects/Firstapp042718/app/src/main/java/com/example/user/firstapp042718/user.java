package com.example.user.firstapp042718;

import java.io.Serializable;

public class user implements Serializable {
    private String userName;
    private String userType;

    private boolean active;

    public user(String userName, String userType){
        this.userName=userName;
        this.userType=userType;
        this.active=true;
    }
    public user(String userName, String userType, boolean active)  {
        this.userName= userName;
        this.userType = userType;
        this.active= active;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String toString(boolean active){
        return this.userName+" ("+this.userType+")";
    }
}
