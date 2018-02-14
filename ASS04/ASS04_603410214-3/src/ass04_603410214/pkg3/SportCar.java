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
    public SportCar(){
        super();
        this.v*=2;// มีความเร็วเป็นสองเท่าของรถธรรมดา
    }
    public SportCar(String name,int v,int gass,int gassUsedRate){
        super(name,v*2,gass,gassUsedRate);
    }
}
