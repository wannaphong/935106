/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2class;

/**
 *
 * @author wannaphong
 */
public class Lab2Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profile pf = new Profile();
        System.out.println();
        /*String profilename=pf.getName();
        System.out.println(profilename);
        pf.getID("603410214-3","1");*/
        new Profile("Ok","1");
    }
    
}
