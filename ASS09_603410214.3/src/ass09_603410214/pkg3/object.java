/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass09_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
public class object { // ประกาศ class ชื่อ object ใช้ในการถอดรหัสแปลงเป็นตัวอักษร
    private String[] data=null;
    public object(String text){ // ประกาศ method ที่เป็นคอนสตรัคเตอร์(Constructor)สำหรับรับค่าเข้ามา โดยรับพารามิเตอร์ text ที่เป็นสตริง
        this.data = text.toUpperCase().split(" "); // ทำการแยกโดยใช้การเว้นวรรค แล้วเก็บไว้ใน data
    }
    private String do_decode(String t){ // ประกาศ method สำหรับแปลงรหัสกลับมาเป็นข้อความ
        String text=""; // ประกาศตัวแปร text ใช้เก็บค่าที่แปลง
        switch(t){ // ใช้ตรวจสอบว่า t เป็นรหัสใด
            case "01000001": // ถ้าเป็น 01000001
                text="A"; // คือ A
                break; // ออก
            case "01000010": // ถ้าเป็น 01000010
                text="B"; // คือ B
                break; // ออก
            case "01000011": // ถ้าเป็น 01000011
                text="C"; // คือ C
                break; // ออก
            case "01000100": // ถ้าเป็น 01000100
                text="D"; // เป็น D
                break; // ออก
            case "01000101": // ถ้าเป็น 01000101
                text="E"; // เป็น E
                break; // ออก
            case "01000110": // ถ้าเป็น 01000110
                text="F"; // เป็น F
                break; // ออก
            case "01000111": // ถ้าเป็น 01000111
                text="G"; // เป็น G
                break; // ออก
            case "01001000": // ถ้าเป็น 01001000
                text="H"; // เป็น H
                break; // ออก
            case "01001001": // ถ้าเป็น 01001001
                text="I"; // เป็น I
                break; // ออก
            case "01001010": // ถ้าเป็น 01001010
                text="J"; // เป็น J
                break; // ออก
            case "01001011": // ถ้าเป็น 01001011
                text="K"; // เป็น K
                break; // ออก
            case "01001100": // ถ้าเป็น 01001100
                text="L"; // เป็น L
                break; // ออก
            case "01001101": // ถ้าเป็น 01001101
                text="M"; // เป็น M
                break; // ออก
            case "01001110": // ถ้าเป็น 01001110
                text="N"; // เป็น N
                break; // ออก
            case "01001111": // ถ้าเป็น 01001111
                text="O"; // เป็น O
                break; // ออก
            case "01010000": // ถ้าเป็น 01010000
                text="P"; // เป็น P
                break; // ออก
            case "01010001": // ถ้าเป็น 01010001
                text="Q"; // เป็น Q
                break; // ออก
            case "01010010": // ถ้าเป็น 01010010
                text="R"; // เป็น R
                break; // ออก
            case "01010011": // ถ้าเป็น 01010011
                text="S"; // เป็น S
                break; // ออก
            case "01010100": // ถ้าเป็น 01010100
                text="T"; // เป็น T
                break; // ออก
            case "01010101": // ถ้าเป็น 01010101
                text="U"; // เป็น U
                break; // ออก
            case "01010110": // ถ้าเป็น 01010110
                text="V"; // เป็น V
                break; // ออก
            case "01010111": // ถ้าเป็น 01010111
                text="W"; // เป็น W
                break; // ออก
            case "01011000": // ถ้าเป็น 01011000
                text="X"; // เป็น X
                break; // ออก
            case "01011001": // ถ้าเป็น 01011001
                text="Y"; // เป็น Y
                break; // ออก
            case "01011010": // ถ้าเป็น 01011010
                text="Z"; // เป็น Z
                break; // ออก
            case "A":  // ถ้าเป็น A
                text="01000001"; //เก็บ A 
                break; // ออก 

            case "B":  // ถ้าเป็น B
                text="01000010"; //เก็บ B 
                break; // ออก 

            case "C":  // ถ้าเป็น C
                text="01000011"; //เก็บ C 
                break; // ออก 

            case "D":  // ถ้าเป็น D
                text="01000100"; //เก็บ D 
                break; // ออก 

            case "E":  // ถ้าเป็น E
                text="01000101"; //เก็บ E 
                break; // ออก 

            case "F":  // ถ้าเป็น F // ถ้าเป็น F
                text="01000110"; //เก็บ F 
                break; // ออก 

case "G":  // ถ้าเป็น G // ถ้าเป็น G
 text="01000111"; //เก็บ G 
   break; // ออก 

case "H":  // ถ้าเป็น H // ถ้าเป็น H
 text="01001000"; //เก็บ H 
   break; // ออก 

case "I":  // ถ้าเป็น I // ถ้าเป็น I
 text="01001001"; //เก็บ I 
   break; // ออก 

case "J":  // ถ้าเป็น J // ถ้าเป็น J
 text="01001010"; //เก็บ J 
   break; // ออก 

case "K":  // ถ้าเป็น K // ถ้าเป็น K
 text="01001011"; //เก็บ K 
   break; // ออก 

case "L":  // ถ้าเป็น L // ถ้าเป็น L
 text="01001100"; //เก็บ L 
   break; // ออก 

case "M":  // ถ้าเป็น M // ถ้าเป็น M
 text="01001101"; //เก็บ M 
   break; // ออก 

case "N":  // ถ้าเป็น N // ถ้าเป็น N
 text="01001110"; //เก็บ N 
   break; // ออก 

case "O":  // ถ้าเป็น O // ถ้าเป็น O
 text="01001111"; //เก็บ O 
   break; // ออก 

case "P":  // ถ้าเป็น P // ถ้าเป็น P
 text="01010000"; //เก็บ P 
   break; // ออก 

case "Q":  // ถ้าเป็น Q // ถ้าเป็น Q
 text="01010001"; //เก็บ Q 
   break; // ออก 

case "R":  // ถ้าเป็น R // ถ้าเป็น R
 text="01010010"; //เก็บ R 
   break; // ออก 

case "S":  // ถ้าเป็น S // ถ้าเป็น S
 text="01010011"; //เก็บ S 
   break; // ออก 

case "T":  // ถ้าเป็น T // ถ้าเป็น T
 text="01010100"; //เก็บ T 
   break; // ออก 

case "U":  // ถ้าเป็น U // ถ้าเป็น U
 text="01010101"; //เก็บ U 
   break; // ออก 

case "V":  // ถ้าเป็น V // ถ้าเป็น V
 text="01010110"; //เก็บ V 
   break; // ออก 

case "W":  // ถ้าเป็น W // ถ้าเป็น W
 text="01010111"; //เก็บ W 
   break; // ออก 

case "X":  // ถ้าเป็น X // ถ้าเป็น X
 text="01011000"; //เก็บ X 
   break; // ออก 

case "Y":  // ถ้าเป็น Y // ถ้าเป็น Y
 text="01011001"; //เก็บ Y 
   break; // ออก 

case "Z":  // ถ้าเป็น Z // ถ้าเป็น Z
 text="01011010"; //เก็บ Z 
   break; // ออก 

        }
        return text; // คืนค่าตัวิอักษรที่แปลงออกมา
    }
    public String get_code(){ // ประกาศ method ชื่อ get_code
        String getdata="["; // ประกาศตัวแปรเริ่มต้นใช้เก็บข้อความ
        int i=0;// ประกาศตัวแปร i ใช้ในการลูป
        while(i<data.length){ // ถ้า i น้อยกว่าความยาวของ data ให้ลูป
            getdata+= do_decode(data[i]); // ทำการแปลงรหัสไปเป็นตัวอักษรแล้วเก็บไว้ใน getdata
            if(i!=data.length-1){ // ถ้า i ไม่เท่ากับความยาว data - 1
                getdata+=", "; // ให้เติม ,
            }
            i++;// เพิ่มค่า i อีก 1
        }
        getdata+="]"; // เติมปิด
        return getdata; // คืนค่าข้อความที่ผ่านการแปลง
    }
}
