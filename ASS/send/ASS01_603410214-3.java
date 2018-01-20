/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass01_603410214.pkg3.java;

/**
 *
 * @author wannaphong
 */
public class ASS01_6034102143Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n; // ประกาศตัวแปร n ใช้เก็บค่า n จากลำดับเลขคณิต
        int sum; // ใช้เก็บผลลัพธ์
        int a1=3; // ประกาศตัวแปร a1 เก็บ 3 จากที่โจทย์กำหนด
        int a2=9; //ประกาศตัวแปร a2 เก็บ 9 จากที่โจทย์กำหนด
        int an=303; // ประกาศตัวแปร an เก็บ 303 จากที่โจทย์กำหนด
        /*
        การหาค่า n
        an=a1+(n-1)d
        an-a1=(n-1)d
        n-1=((an-a1)/d)
        n=((an-a1)/d)+1
        */
        int d = a2-a1; // ทำการหาค่า d ด้วย an+1 - an
        n=((an-a1)/d)+1;// ทำการหาค่า n โดยใช้ n = (an-a1/d)+1
        /*
        ทำการแปลงสมการจากโจทย์ได้เป็น
        (6*(n*(n+1)/2))-(3*n)
        */
        sum=(6*(n*(n+1)/2))-(3*n); // ทำการคำนวณหาผลลัพธ์
        System.out.println("Ans : "+sum); // แสดงผลหาคำตอบ
    }
    
}
