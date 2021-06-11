/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omerr;

/**
 *this function of playground
 * @author omer
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Playground {

    String name;
    String location;
    String size;
    double price_per_hour;
    String pid = "0";
    String date = "0";
    String time = "0";
    String id;
    int complaints;
    /**
     * 
     * @param name to store the value of name in attribute is called name
     * @param location to store the value of name in attribute is called location
     * @param size to store the value of name in attribute is called size
     * @param price_per_hour to store the value of name in attribute is called price_per_hour 
     */
    public Playground(String name, String location, String size, double price_per_hour) {
        complaints=0;
        this.name = name;
        this.location = location;
        this.size = size;
        this.price_per_hour = price_per_hour;
    }
    /**
     * 
     * @param b the playground that player want cancel booking
     * that check this deadline to cancel booking is over or nor 
     * @return true or false
     */
 public boolean check1(Playground b) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        LocalDateTime now = LocalDateTime.now();
        String x = dtf.format(now);
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        int i1=0, i2=0, c1 = 0, c2 = 0;
        String s1 = "", s2 = "";
        for (int i = 0; i <= x.length(); i++) {
            if (i == x.length()) {
                i1 = Integer.parseInt(s1);
                arr1[c1] = i1;
                c1++;
                s1 = "";

            } else if (x.charAt(i) == ':') {
                i1 = Integer.parseInt(s1);
                arr1[c1] = i1;
                c1++;
                s1 = "";
            } else {
                s1 = s1 + x.charAt(i);
            }
        }
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:MM:ss");
        String xx = dt.format(now);
        for (int i = 0; i <= xx.length(); i++) {
            if (i == xx.length()) {
                i2 = Integer.parseInt(s2);
                arr2[c2] = i2;
                c2++;
                s2 = "";

            } else if (xx.charAt(i) == ':') {
                i2 = Integer.parseInt(s2);
                arr2[c2] = i2;
                c2++;
                s2 = "";
            } else {
                s2 = s2 + x.charAt(i);
            }
        }
        int i3=0, i4=0;
        String s3 = "", s4 = "";
        int arr3[] = new int[3];
        int arr4[] = new int[3];
        int c3 = 0, c4 = 0;
        for (int i = 0; i <= b.date.length(); i++) {
            if (i == b.date.length()) {
                System.out.println("i3 =  "+i3);
                i3 = Integer.parseInt(s3);
                
                arr3[c3] = i3;
                c3++;
                s3 = "";
            } else if (b.date.charAt(i) == ':') {
                i3 = Integer.parseInt(s3);
                arr3[c3] = i3;
                c3++;
                s3 = "";
            } else {
                s3 = s3 + b.date.charAt(i);
            }
        }
        for (int i = 0; i <= b.time.length(); i++) {
            if (i == b.time.length()) {
                i4 = Integer.parseInt(s4);
                arr4[c4] = i4;
                c4++;
                s4 = "";

            } else if (b.time.charAt(i) == ':') {
                i4 = Integer.parseInt(s4);
                arr4[c4] = i4;
                c4++;
                s4 = "";
            } else {
                s4 = s4 + b.time.charAt(i);
            }
        }
        boolean tchecker = true;
        boolean dchecker = true;
        if(arr1[2]>arr3[2])
        {
           return  true;
        }
        else if(arr1[2]==arr3[2]&&arr1[1]>arr3[1])
        {
            return true;
        }
        else if(arr1[2]==arr3[2]&&arr1[1]==arr3[1]&&arr1[0]>arr3[0])
        {
            return true;
        }
        else if(arr1[2]==arr3[2]&&arr1[1]==arr3[1]&&arr1[0]==arr3[0]&&arr2[2]>arr4[2])
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
 /**
  * 
  * @param b that blayground that avliavle to booking by players or not
  * @return true or false
  * this function to check this playground are avalabe or not 
  */
    public boolean check(Playground b) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        LocalDateTime now = LocalDateTime.now();
        String x = dtf.format(now);
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        int i1=0, i2=0, c1 = 0, c2 = 0;
        String s1 = "", s2 = "";
        for (int i = 0; i <= x.length(); i++) {
            if (i == x.length()) {
                i1 = Integer.parseInt(s1);
                arr1[c1] = i1;
                c1++;
                s1 = "";

            } else if (x.charAt(i) == ':') {
                i1 = Integer.parseInt(s1);
                arr1[c1] = i1;
                c1++;
                s1 = "";
            } else {
                s1 = s1 + x.charAt(i);
            }
        }
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:MM:ss");
        String xx = dt.format(now);
        for (int i = 0; i <= xx.length(); i++) {
            if (i == xx.length()) {
                i2 = Integer.parseInt(s2);
                arr2[c2] = i2;
                c2++;
                s2 = "";

            } else if (xx.charAt(i) == ':') {
                i2 = Integer.parseInt(s2);
                arr2[c2] = i2;
                c2++;
                s2 = "";
            } else {
                s2 = s2 + x.charAt(i);
            }
        }
        int i3=0, i4=0;
        String s3 = "", s4 = "";
        int arr3[] = new int[3];
        int arr4[] = new int[3];
        int c3 = 0, c4 = 0;
        for (int i = 0; i <= b.date.length(); i++) {
            if (i == b.date.length()) {
                i3 = Integer.parseInt(s3);
                arr3[c3] = i3;
                c3++;
                s3 = "";
            } else if (b.date.charAt(i) == ':') {
                i3 = Integer.parseInt(s3);
                arr3[c3] = i3;
                c3++;
                s3 = "";
            } else {
                s3 = s3 + b.date.charAt(i);
            }
        }
        for (int i = 0; i <= b.time.length(); i++) {
            if (i == b.time.length()) {
                i4 = Integer.parseInt(s4);
                arr4[c4] = i4;
                c4++;
                s4 = "";

            } else if (b.time.charAt(i) == ':') {
                i4 = Integer.parseInt(s4);
                arr4[c4] = i4;
                c4++;
                s4 = "";
            } else {
                s4 = s4 + b.time.charAt(i);
            }
        }
        boolean tchecker = true;
        boolean dchecker = true;
        /*if(arr1[2]>arr3[2])
        {
           return  true;
        }
        else if(arr1[2]==arr3[2]&&arr1[1]>arr3[1])
        {
            return true;
        }*/
        if(arr1[2]==arr3[2]&&arr1[1]==arr3[1]&&arr1[0]<arr3[0])
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
   /**
    * 
    * @param i index of playground in array list
    * this function display all data about playground owner
    */
    public void display_date(int i) {
        System.out.println(i +"name : " + name + "  location : " + location + "  size : " + size + "  Price_per_hour : " + price_per_hour);
    }
}
