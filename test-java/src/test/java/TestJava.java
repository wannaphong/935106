/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class TestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shop shop1 = new shop();
        while(true){
            System.out.println("โปรแกรมซื้อสินค้า");
            System.out.println("กด 1 ซื้อไม่ใช้คะแนน");
            System.out.println("กด 2 ซื้อใช้คะแนน");
            System.out.println("กด 3 ออก");
            Scanner s = new Scanner(System.in);
            System.out.print("> ");
            String m = s.nextLine();
            if(m.equals("1")){
                System.out.print("Input : ");
                String m1 = s.nextLine();
                if(shop1.save(m1)==false){
                    System.out.print("ไม่สามารถซื้อได้");
                }
            }
            else if(m.equals("2")){
                System.out.print("Input : ");
                String m1 = s.nextLine();
                if(shop1.save_using_p(m1)==false){
                    System.out.print("ไม่สามารถซื้อได้");
                }
            }
            else if(m.equals("3")){
                break;
            }
            else{
                System.out.println("พิมพ์ใหม่");
            }
            System.out.println();
        }
        
    }
    
}
