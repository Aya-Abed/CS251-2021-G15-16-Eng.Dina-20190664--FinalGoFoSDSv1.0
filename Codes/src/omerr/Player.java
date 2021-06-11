package omerr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author omer
 * this class of player
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Player extends User {

    ArrayList<Playground> book = new ArrayList();
    ArrayList<Player> favorite = new ArrayList();
    E_wallet money;
    static int counter = 0;
    /**
     * this is empty constructor to increase counter to increase id by default;
     */
    public Player() {
        counter++;
        String vv = String.valueOf(counter);
        id += vv;
    }
   /**
     * @param  name to store the value of name in attribute is called name
     * @param  password to store the value of password in attribute is called password
     * @param  email to store the value of email in attribute is called email
     * @param  phone to store the value of phone in attribute is called phone
     * @param  location to store the value of  location in attribute is called location
     * this copy constructor to store data of attribute of class called user.
     */
    public Player(String name, String password, String email, String phone, String location) {
        super(name, password, email, phone, location);
        counter++;
        String vv = String.valueOf(counter);
        id += vv;
    }
    /** 
     * 
     * @param name to set a new value of attribute called name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @param password name to set a new value of attribute called password
     */   
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @param email name to set a new value of attribute called email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
     /**
      * 
      * @param phone name to set a new value of attribute called phone
      */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     *
     * @param location name to set a new value of attribute called location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * 
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return the value of id
     */
    public String getId() {
        return id;
    }
  /**
     * 
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }
   /**
     * 
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }
    /**
     * 
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * 
     * @return the value of location
     */
    public String getLocation() {
        return location;
    }
    /**
     * 
     * @param p the playground that player want to book
     * @param d date that player want to play
     * @param t time that player want to play
     */ 
    public void Booking(Playground p, String d, String t) {
        p.date = d;
        p.time = t;
        p.pid = this.id;
        book.add(p);
    }
   /**
    * 
    * @param b the playground that player want to cancel book
    */
    public void cancel_booking(Playground b) {

        for (int i = 0; i < book.size(); i++) {
            if (b.check1(b)) {
                b.time = "0";
                b.date = "0";
                b.pid = "0";
                book.remove(i);
                break;
            }
        }
    }
   /**
    * 
    * @param b the payer that want to add for favorite team
    */
    public void add_favorite_player(Player b) {
        favorite.add(b);
    }
   /* public boolean add_favorite_team(String n, String ID) {
        for (int i = 0; i < favorite.size(); i++) {
            if (favorite.get(i).getName() == n && favorite.get(i).getId() == ID) {
                return true;
            }
        }
        return false;
    }*/
    /**
     * this function to display all playgrounds that booking by player
     */    
    public void displayBooking() {
        for (int i = 0; i < book.size(); i++) {
            book.get(i).display_date(i + 1);
        }
    }
    /**
     * this function to display all data about player 
     */
    public void print_data()
   {
       System.out.println("name : "+name+"  id = "+id+"  password : "+password+"  email : "+email+"  phone: "+phone+"  location : "+location );
   }
}
