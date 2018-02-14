/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass04_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
public class Car { // ประกาศ class ชื่อ Car
    public String name; // ชื่อรถ
    public int gass; // ปริมาณน้ำมัน
    public int gassUsedRate; // อัตราการใช้น้ำมัน
    public int v; // ความเร็วรถ
    private int time; // เวลา
    public Car(){
        this.name="honda"; // กำหนดชื่อรถว่า honda
        this.v=2; // กำหนดความเร็วเป็น 2
        this.gass=2;
        this.gassUsedRate=2;
    }
    public Car(String name,int v,int gass,int gassUsedRate){
        this.name=name; // ให้นำ name ที่รับมาจากพารามิเตอร์เข้ามาเก็บไว้ในตัวแปร name ของ class
        this.v=v; // ให้นำ v ที่รับมาจากพารามิเตอร์เข้ามาเก็บไว้ในตัวแปร v ของ class
        this.gass=gass;
        this.gassUsedRate=gassUsedRate;
    }
    public void run(){ // method run จากโจทย์ + run : void
        this.time=0; // เวลาเริ่มต้นที่ 0
        for(int i=gass;i>=0;i-=gassUsedRate){ // ทำการลูปจนกว่าปริมาณน้ำมันจะเหลือ 0
            System.out.println("Car name: "+this.name+", distance: "+(this.time*this.v)+", Gass letf: "+i); // ทำการแสดงผลตามที่โจทย์กำหนด
            this.time++; // นับเวลาเพิ่มขึ้น
        }
    }
}
