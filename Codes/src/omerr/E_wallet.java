/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omerr;

/**
 *
 * @author omer
 * this class like E-wallet users use it to Pay and receive them money on it.
 */
public class E_wallet {
  double balance;
    /**
     * .empty constructor to initial balance by zero 
     */
    public E_wallet() {
        balance=0;
    }
 /**
  * 
  * @param d is the value of money that user want to deposit in your E-wallet; 
  *this function to add money to E-wallet
  */
  public void deposit(double d)
  {
  balance+=d;
  }
  /**
  * 
  * @param w is the value of money that user want to withdraw from your E-wallet;
  * this function to withdraw money from E-wallet 
  */
  public void withdraw(double w)
  {
    if(w>balance)
    {
        System.out.println("the value bigger than balance");
    }
    else 
    {
        balance-=w;
    }
  }
  
}
