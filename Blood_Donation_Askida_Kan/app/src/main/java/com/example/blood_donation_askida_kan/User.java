package com.example.blood_donation_askida_kan;

public class User {
    public String username;
    public String blood;
    public Number phone;
    public String location;

    public User() {
    }

    public User (String username, String blood, Number phone, String location) {
        this.username= username;
        this.blood = blood;
        this.phone=phone;
        this.location =location;

    }
}
