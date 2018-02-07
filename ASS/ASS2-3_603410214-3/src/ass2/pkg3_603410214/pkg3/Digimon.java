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
public class Digimon extends HolyAngemon_Priest_Mode{ // ประกาศ class ชื่อ Digimon โดยเรียกใช้งาน
    public boolean Pinocchimon_vs_HolyAngemon(int power_HP){ // ประกาศ method ชื่อ  Pinocchimon_vs_HolyAngemon ใช้ในการต่อสู่ระหว่าง Pinocchimon (โหมดอมตะ) กับ HolyAngemon:Priest Mode
        HP_HA_P_M-=power_HP; // ให้เอาค่า HP ที่รับมาไปต่อสู้โดยลบกับค่า HP ของ HolyAngemon:Priest Mode
        if(HP_HA_P_M<=0){ // ถ้าลบกันแล้วน้อยกว่าหรือเท่ากับ 0
            return true; // ให้คืนค่า true คือ ชนะ
        }
        else{ // ถ้าไม่
            return false; // ให้คืนค่า false คือ แพ้
        }
    }
}
