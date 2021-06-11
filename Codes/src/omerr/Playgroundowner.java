/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omerr;

/**
 *
 * @author omer
 * this function of playground owner
 */
import java.util.ArrayList;
//import static omerr.Player.counter;
public class Playgroundowner extends User {
   E_wallet money;
   ArrayList<Playground> playgrounds = new ArrayList();
   static int count = 0;
   /**
    * empty counstructor to increas id by default
    */
   Playgroundowner()
   {
       count++;
       String vv = String.valueOf(count);
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
    public Playgroundowner(String name, String password, String email, String phone, String location) {
        super(name, password, email, phone, location);
        count++;
       String vv = String.valueOf(count);
       id += vv; 
    }
    /**
     * 
     * @param b the playground that owner create it
     * this function to add new playground to owner
     */
   public void addplayground (Playground b)
   {
       b.id=id;
       playgrounds.add(b);
   }
   /**
    * this function to display all data about playground owner
    */
     public void print_data()
   {
       System.out.println("name : "+name+"  id = "+id+"  password : "+password+"  email : "+email+"  phone: "+phone+"  location : "+location );
   }
    
}
