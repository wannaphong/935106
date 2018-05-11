/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author wannaphong
 */
import cal.Cal;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Cal c = new Cal(5,3);
        System.out.println(c.plue());
        System.out.println(c.del());
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
