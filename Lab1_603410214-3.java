/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* System.out.println("Hello World !!"); // แสดงผลและขึ้นบรรทัดใหม่
        System.out.print("Hello World !!");*/
       /*System.out.print("ชื่อ นายวรรณพงษ์  ภัททิยไพบูลย์  ชื่อเล่น ต้นตาล สาขา CIS\n" +
"พี่รหัสชื่อ นางสาวชลรัตน์ มาทา ชื่อ พี่อ้อย\n" +
"ลุงรหัสชื่อ นายธีรพัฒน์ เทศชารี ชื่อ ลุงต้น\n" +
"ป้ารหัสชื่อ นางสาวบุปผา มณีแสง ชื่อ ป้ามิ้ม\n" +
"ปู่รหัสชื่อ นายองอาจ คำจันทร์ ชื่อ ปู่นาน");*/
      /* System.out.print("Input num1 : ");
       Scanner scan = new Scanner(System.in);
       String num1 = scan.nextLine(); // หรือ ใช้ nextInt ในการรับ int ก็ได้
       System.out.print("Input num2 : ");
       String num2 = scan.nextLine();
       System.out.println(num1+"+"+num2+"="+(Integer.valueOf(num1)+Integer.valueOf(num2)));*/
      Double x1,x2,a,b,c;
      System.out.print("a : ");
      Scanner scan = new Scanner(System.in);
      a=scan.nextDouble();
      System.out.print("b : ");
      b=scan.nextDouble();
      System.out.print("c : ");
      c=scan.nextDouble();
      x1=((-1*(b))+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
      x2=((-1*(b))-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
      System.out.println("x1 : "+x1+"\nx2: "+x2);
    }
    
}
