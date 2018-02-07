/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2.pkg3_603410214.pkg3;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class ASS23_6034102143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ASS2-3_603410214-3"); // แสดงชื่องานนี้ :D
        System.out.print("Item (1 - 2) : "); // แสดงผลว่าต้องการรับว่าต้องการให้รันโปรแกรมตามโจทย์ข้อไหน
        Scanner s = new Scanner(System.in); //ประกาศตัวแปร s แทน new Scanner(System.in) ใช้ในการรับข้อมูล
        int Item =s.nextInt(); // ใช้รับตัวเลขว่าต้องการให้ทำงานข้อไหน
        System.out.println(); // แสดงผลเพื่อเว้นบรรทัด
        if(Item==1){ // กรณีข้อ 1
            System.out.println("Book Biography :D"); // ใช้แสดงหัวข้อโปรแกรมว่านี่คือส่วนต้องการจัดเก็บบรรณานุกรม
            System.out.print("Author : "); // แสดงผลว่าต้องการรับชื่อผู้แต่ง
            String Author = s.nextLine(); // รับข้อมูลชื่อผู้แต่ง
            System.out.print("Years : "); // แสดงผลว่าต้องการรับปีที่พิมพ์
            String Years = s.nextLine(); // รับข้อมูลปีที่พิมพ์
            System.out.print("Book Name : "); // แสดงผลว่าต้องการรับชื่อหนังสือ
            String Book_Name=s.nextLine(); // รับข้อมูลชื่อหนังสือ
            System.out.print("Times : "); // แสดงผลว่าต้องการรับครั้งที่พิมพ์
            String times = s.nextLine(); // รับข้อมูลครั้งที่พิมพ์
            System.out.print("Place : "); // แสดงผลว่าต้องการรับสถานที่พิมพ์
            String Place = s.nextLine(); // รับข้อมูลสถานที่พิมพื
            System.out.print("Publisher : "); // แสดงผลว่าต้องการรับสำนักพิมพ์
            String Publisher = s.nextLine(); // รับข้อมูลสำนักพิมพ์
            Book book1=new Book(Author,Years,Book_Name,times,Place,Publisher); // เรียกใช้ class ชื่อ Book พร้อมส่งข้อมูลไปให้ class
            System.out.println(book1.Report()); // แสดงอ้างอิงบรรณานุกรม
        }
        else if(Item==2){ // กรณีข้อ 2
            System.out.println("Pinocchimon vs HolyAngemon: Priest Mode\nYou are Pinocchimon. (Immortal mode)\n"); // โชว์ว่านี่คือ เกมการต่อสู้ของดิจิม่อนระหว่าง Pinocchimon (โหมดอมตะ) กับ HolyAngemon: Priest Mode
            System.out.print("Fight (HP) : "); // กรอกข้อมูลค่า HP ที่ต้องการต่อสู้
            int HP = s.nextInt(); // รับข้อมูลค่า HP ซึ่งเป็น int เก็บไว้ใน HP
            if(HP>0&&HP<=2000){ // ถ้า HP อยู่ในรหะว่าง 1 - 2000
                Digimon game=new Digimon();// เรียกใช้ class ชื่อ Digimon โดยประกาศไว้ในตัวแปร game
                if(game.Pinocchimon_vs_HolyAngemon(HP)==true){ // ถ้าผลการต่อสู้ คือ ชนะ
                    System.out.println("YOU WIN!!"); // ให้แสดงผลว่าคุณชนะ
                }
                else{ // กรณีที่ไม่ชนะ
                    System.out.println("You Lose!!"); // ให้แสดงผลว่าคุณแพ้
                    System.out.println("-------------------------------------------------"); // แสดงการเว้นวรรตามตัวอย่างของโจทย์
                    System.out.println("HP of "+game.name+": "+game.getHP()); // แสดงข้อมูลค่า HP ของ HolyAngemon ที่เหลืออยู่
                }
            }
            else{ // กรณีรับน้อยกว่า 1 หรือรับเกิน 2000
                System.out.println("No have power."); // แสดงข้อความบอกว่าเกินขอบเขต HP ที่มี
            }
        }
        else{ // กรณีไม่อยู่ในข้อ 1 หรือข้อ 2
            System.out.println("Are you ok ?"); // แสดงข้อความบอกว่าคุณโอเคไหม ?
        }
        
        System.out.println(); // แสดงผลเพื่อเว้นบรรทัด
    }
    
}
