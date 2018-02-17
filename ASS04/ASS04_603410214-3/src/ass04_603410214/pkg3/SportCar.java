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
public class SportCar extends Car { // ประกาศ class ชื่อ SportCar โดยสืบทอดมาจาก class ชื่อ Car
    public SportCar(){ //constructer
        super(); // สืบทอดคุณสมบัติจาก constructer ของ Car
        this.v*=2;// มีความเร็วเป็นสองเท่าของรถธรรมดา
    }
    public SportCar(String name,int v,int gass,int gassUsedRate){ // constructer ที่ overload
        super(name,v*2,gass,gassUsedRate); // สืบทอดคุณสมบัติจาก constructer ของ Car ที่มีพารามิเตอร์
    }
    public void run(){
        int time=0; // เวลาเริ่มต้นที่ 0
        for(int i=gass;i>=0;i-=gassUsedRate){ // ทำการลูปจนกว่าปริมาณน้ำมันจะเหลือ 0
            System.out.println("Car name: "+this.name+", distance: "+(time*this.v)+", Gass letf: "+i); // ทำการแสดงผลตามที่โจทย์กำหนด
            time++; // นับเวลาเพิ่มขึ้น
        }
    }
}