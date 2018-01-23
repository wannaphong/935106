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
        int n; // ประกาศค่า n ที่ใช้ในการเก็บค่าจำนวนพจน์
        int sum=0; // ประกาศตัวแปรสำหรับเก็บค่าจากผลรวม ค่าเริ่มต้นคือ 0
        int a1=3; // จำนวนเริ่มต้นที่ a1 จากที่โจทย์กำหนด
        int a2=9; // จำนวนที่ a2 จากที่โจทย์กำหนด
        int an=303; // จำนวนสุดท้าย จากที่โจทย์กำหนด
        /*
        หาค่า n
        an=a1+(n-1)d
        an-a1=(n-1)d
        n-1=((an-a1)/d)
        n=((an-a1)/d)+1
        */
        int d = a2-a1; // ค่า d โดยเอา an+1 - an
        n=((an-a1)/d)+1;// คำนวณหาจำนวนพจน์หาได้จากสูตร n = (an-a1/d)+1
        /*
        จากสมการสัญลักษณ์แทนการบวกจาก โจทย์ แปลงออกมาได้เป็น
        (6*(n*(n+1)/2))-(3*n)
        ทำการแปลงสมการใหม่ ได้สมการการบวกทีละ n ดังนี้
        (6*i) - 3
        */
        for(int i=1;i<=n;i++){ // ทำการลูปตั้งแต่ 1 จนถึงจำนวนที่ n ของซัมเมชั่น
            sum+=(6*i)-3; // ให้บวกค่าทีละ i เข้าไป โดนคำนวณค่าทีละ n ตามขั้นตอนการคำนวณแบบลูป
        }
        //sum=(6*(n*(n+1)/2))-(3*n); // สมการจากโจทย์ที่ผ่านการแปลงสูตรแล้ว
        System.out.println("Ans : "+sum); // แสดงผลลัพธ์
    }
    
}
