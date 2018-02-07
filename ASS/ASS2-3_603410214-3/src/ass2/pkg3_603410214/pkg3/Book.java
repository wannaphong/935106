/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2.pkg3_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
public class Book extends bibliography{ // ประกาศ class ชื่อ Book โดยสืบทอดคุณสมบัติจาก class ชื่อ bibliography
    public Book(String Author,String Years,String Book_Name,String times,String Place,String Publisher){ // ประกาศคอนสตัสเตอร์โดยต้องการข้อมูล String Author,String Years,String Book_Name,String times,String Place,String Publisher
        this.Author=Author; // เก็บข้อมูลชื่อผู้แต่งลงใน Author ของ class Book ที่สืบทอดมาจาก bibliography
        this.Years=Years; // เก็บข้อมูลปีที่พิมพ์ลงใน Years ของ class Book ที่สืบทอดมาจาก bibliography
        this.Book_Name=Book_Name; // เก็บข้อมูลชื่อหนังสือลงใน Book_Name ของ class Book ที่สืบทอดมาจาก bibliography
        this.times=times; // เก็บข้อมูลครั้งที่พิมพ์ลงใน times ของ class Book ที่สืบทอดมาจาก bibliography
        this.Place=Place; // เก็บข้อมูลสถานที่พิมพ์ลงใน Place ของ class Book ที่สืบทอดมาจาก bibliography
        this.Publisher=Publisher; // เก็บข้อมูลสำนักพิมพ์ลงใน Publisher ของ class Book ที่สืบถอดมาจาก bibliography
    }
    public String Report(){ // ใช้แสดงรายการอ้างอิงบรรณานุกรม
        return this.Author+".("+this.Years+")."+this.Book_Name+" (พิมพ์ครั้งที่ "+this.times+")."+this.Place+": "+this.Publisher+'.';// ส่งค่ารายการอ้างอิงบรรณานุกรม
    }
}
