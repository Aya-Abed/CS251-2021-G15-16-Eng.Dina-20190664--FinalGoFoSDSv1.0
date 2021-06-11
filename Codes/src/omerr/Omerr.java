/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omerr;

/**
 *
 * @author omer
 * this main to test function sign up as player or owner and booking playground and add playground 
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Omerr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        admin a = new admin();
        int x = 0;
        int y = 0;
        while (true) {
            System.out.println("enter 1 to register new  player");
            System.out.println("enter 2 to register new playgorundowner");
            System.out.println("enter 3 to login as a player");
            System.out.println("enter 4 to login as a playground owner");
            System.out.println("4-Exit");
            System.out.println("enter your chose");
            x = input.nextInt();
            if (x == 1) {
                String nam, pass, e, phon, loc;
                System.out.println("entr your name");
                nam = input.next();
                System.out.println("entr your password");
                pass = input.next();
                System.out.println("entr your email");
                e = input.next();
                System.out.println("entr your phone");
                phon = input.next();
                System.out.println("entr your location");
                loc = input.next();
                Player p = new Player(nam, pass, e, phon, loc);
                a.players.add(p);
                while (true) {
                    System.out.println("enter 1 to book the playground");
                    System.out.println("enter 2 to cancel booking");
                    System.out.println("enter 3 to display all data");
                    System.out.println("enter 4 to display your booking");
                    System.out.println("enter 5 to Exit");
                    System.out.println("enter your choose");
                    y = input.nextInt();
                    if (y == 1) {
                        int n = 0;
                        String d, t;
                        a.display_all_avalibale_playground();
                        System.out.println("enter number of playground that you want to booking");
                        n = input.nextInt();
                        System.out.println("enter date in dd:MM:yyyy and time in  HH:MM:ss ");
                        d = input.next();
                        t = input.next();
                        p.Booking(a.allplayground.get(n - 1), d, t);
                    } else if (y == 2) {
                        int n = 0;
                        p.displayBooking();
                        System.out.println("enter number of playground that you want to cancel the booking");
                        n = input.nextInt();
                        p.cancel_booking(p.book.get(n - 1));
                        p.displayBooking();
                    } else if (y == 3) {
                        p.print_data();
                        
                    }
                    else if(y==4)
                    {
                        p.displayBooking();
                    }
                    else {
                        break;
                    }
                }
            } else if (x == 2) {
                String nam, pass, e, phon, loc;
                System.out.println("entr your name");
                nam = input.next();
                System.out.println("entr your password");
                pass = input.next();
                System.out.println("entr your email");
                e = input.next();
                System.out.println("entr your phone");
                phon = input.next();
                System.out.println("entr your location");
                loc = input.next();
                Playgroundowner o = new Playgroundowner(nam, pass, e, phon, loc);
                 int mn = 0;
                while (true) {
                    System.out.println("ENTER 1 to addplayground");
                    System.out.println("enter 2 to displayy of data");
                    System.out.println("enter 3 to exit");
                    mn = input.nextInt();
                    if (mn == 1) {
                        String na, si, loca;
                        double pho;
                        System.out.println("entr the name playground");
                        na = input.next();
                        System.out.println("entr your location of playground");
                        loca = input.next();
                        System.out.println("entr your size of playground");
                        si = input.next();
                        System.out.println("entr your price_per_hour of playground");
                        pho = input.nextDouble();
                        Playground g = new Playground(na, loca, si, pho);
                        o.addplayground(g);
                        a.add_playground(g);
                        a.add_playgroundowner(o);
                    } else if (mn == 2) {
                        o.print_data();
                    } else if(mn==3) {
                        break;
                    }

                }

            } else if (x == 3) {
                int vv;
                while (true) {
                    String na, pa;
                    na = input.next();
                    pa = input.next();
                    vv = a.Loginasplayer(na, pa);
                    if (vv != -1) {
                        break;
                    }
                }
                while (true) {
                    System.out.println("enter 1 to book the playground");
                    System.out.println("enter 2 to cancel booking");
                    System.out.println("enter 3 to display all data");
                    System.out.println("enter 4 to all booking");
                    System.out.println("enter 5 to Exit");
                    y = input.nextInt();
                    if (y == 1) {
                        int n = 0;
                        String d, t;
                        a.display_all_avalibale_playground();
                        System.out.println("enter number of playground that you want to booking");
                        n = input.nextInt();
                        System.out.println("enter date in dd:MM:yyyy and time in  HH:MM:ss ");
                        d = input.next();
                        t = input.next();
                        a.players.get(vv).Booking(a.allplayground.get(n - 1), d, t);
                    } else if (y == 2) {
                        int n = 0;
                        a.players.get(vv).displayBooking();
                        System.out.println("enter number of playground that you want to cancel the booking");
                        n = input.nextInt();
                        a.players.get(vv).cancel_booking(a.players.get(vv).book.get(n - 1));
                        a.players.get(vv).displayBooking();
                    } else if (y == 3) {
                        a.players.get(vv).print_data();
                    }
                    else if(y==4)
                    {
                        a.players.get(vv).displayBooking();
                    }
                    else {
                        break;
                    }
                }
            } else if (x == 4) {
                int vv;
                while (true) {
                    String na, pa;
                    na = input.next();
                    pa = input.next();
                    vv = a.Loginasowner(na, pa);
                    if (vv != -1) {
                        break;
                    }
                }
                while (true) {
                    int mn = 0;
                    System.out.println("ENTER 1 to add playground");
                    System.out.println("ENTER 2 to display all data");
                    System.out.println("enter 2 to exit");
                    mn = input.nextInt();
                    if (mn == 1) {
                        String nam, si, loca;
                        double ph;
                        System.out.println("entr the name playground");
                        nam = input.next();
                        System.out.println("entr your location of playground");
                        loca = input.next();
                        System.out.println("entr your size of playground");
                        si = input.next();
                        System.out.println("entr your price_per_hour of playground");
                        ph = input.nextDouble();
                        Playground g = new Playground(nam, loca, si, ph);
                        a.playgroundowners.get(vv).addplayground(g);
                    } else if (mn == 2) {
                        a.playgroundowners.get(vv).print_data();
                    } else {
                        break;
                    }

                }
            } else if(x==4) {
                break;
            }
        }
    }

}
