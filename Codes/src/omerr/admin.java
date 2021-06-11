/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omerr;

/**
 *
 * @author omer
 * this class control in all another classes and display avalibale playgrounds to book.
 */
import java.util.ArrayList;

public class admin {

    ArrayList<Playground> allplayground = new ArrayList();
    ArrayList<Player> players = new ArrayList();
    ArrayList<Playgroundowner> playgroundowners= new ArrayList();
    /**
     * empty constructor
     */
    public admin() {
    }
    /**
     * 
     * @param b this the playground created by owner.
     * this function to add playground to array list to control in it; 
     */
   public void add_playground(Playground b)
   {
       allplayground.add(b);
   }
   /**
    * 
    * @param b this is a player that sign up and add all data.
    * this function to add player to array list to control in it;
    */
    public void add_player(Player b)
   {
       players .add(b);
   }
    /**
     * @param b this is a playground owner that sign up and add all data.
     *  this function to add playground owner to array list to control in it;
     *
     */
    public void add_playgroundowner(Playgroundowner b)
   {
       playgroundowners.add(b);
   }
    /**
     * 
     * @param b  the playground that get a complaints from players
     * the function to remove playground with compliants greater than 5. 
     */
    public void complaints_of_playground(Playground b)
    {
       b.complaints+=1;
       for(int i=0;i<allplayground.size();i++)
       {
           if(allplayground.get(i).complaints>=5)
           {
               allplayground.remove(i);
           }
       }
    }
    /**
     * 
     * @param n to get the name of player.
     * @param p to get the password of player
     * @return the index of player in array list called player
     * this function to login player
     */
   public int Loginasplayer(String n,String p)
    {
        int l=0;
        for(int i=0;i<players.size();i++)
        {
           if(players.get(i).name==n&&players.get(i).password==p)
           {
                        return i;
           }
        }
        return -1;
        
    }
   /**
     * 
     * @param n to get the name of playground owner.
     * @param p to get the password of  playground owner
     * @return the index of  playground owner in array list called  playground owner
     * this function to login  playground owner
     */
   public int Loginasowner(String n,String p)
    {
        int l=0;
        for(int i=0;i<playgroundowners.size();i++)
        {
           if(playgroundowners.get(i).name==n&&playgroundowners.get(i).password==p)
           {
                        return i;
           }
        }
        return -1;
        
    }
   /**
    * this function to display all available data of=n playgrounds
    */
    public void display_all_avalibale_playground() {
        for (int i = 0; i < allplayground.size(); i++) {
            if(allplayground.get(i).date == "0" || allplayground.get(i).time == "0") 
            {
             allplayground.get(i).display_date(i+1);
                
            } else if(allplayground.get(i).check(allplayground.get(i))) 
            {
                allplayground.get(i).display_date(i+1);
            }
        }
    }
}
