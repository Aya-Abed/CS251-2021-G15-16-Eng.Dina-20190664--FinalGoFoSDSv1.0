package omerr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * this class is to store the Mutual data of player and playground owner
 *
 * @author omer this class is to store the Mutual data of player and playground
 * owner
 *
 */
public class User {

    String name;
    String id = "20190";
    String password;
    String email;
    String phone;
    String location;

    /**
     * this is empty constructor
     */
    public User() {
    }

    /**
     * @param  name to store the value of name in attribute is called name
     * @param  password to store the value of password in attribute is called password
     * @param  email to store the value of email in attribute is called email
     * @param  phone to store the value of phone in attribute is called phone
     * @param  location to store the value of  location in attribute is called location
     * this copy constructor to store data of attribute
     */
    public User(String name, String password, String email, String phone, String location) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

}
