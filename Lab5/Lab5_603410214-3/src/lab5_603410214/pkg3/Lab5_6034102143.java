/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_603410214.pkg3;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class Lab5_6034102143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayClass arrayclass=new ArrayClass();
        System.out.print("Number input : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        arrayclass.AddArrayList(n);
    }
    
}
