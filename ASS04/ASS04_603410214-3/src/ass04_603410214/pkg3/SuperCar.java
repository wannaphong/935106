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
public class SuperCar extends Car { // ประกาศ class ชื่อ SuperCar โดยสืบทอดมาจาก class ชื่อ Car
    public SuperCar(){ //constructer
        super(); // สืบทอดคุณสมบัติจาก constructer ของ Car
        this.v*=2;// มีความเร็วเป็นสองเท่าของรถธรรมดา
    }
    public SuperCar(String name,int v,int gass,int gassUsedRate){ // constructer ที่ overload
        super(name,v*2,gass,gassUsedRate); // สืบทอดคุณสมบัติจาก constructer ของ Car ที่มีพารามิเตอร์
    }
}
