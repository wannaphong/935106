/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wannaphong
 */
public class JavaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Map students = new HashMap();
        Map<String,String> students=new HashMap();
        students.put("Ta", "4.00");
        students.put("Mo", "3.57");
        students.put("na", "2.59");
        System.out.println(students);
        System.out.println(students.get("Mo"));
        System.out.println(students.entrySet());
        for(Map.Entry<String,String> data:students.entrySet()){ // นี่คือลูป for in ใน java จะดึงเอาข้อมูลทีละ index มาใส่ใน data จาก students
            System.out.println(data.getKey()+"/"+data.getValue());
        }
        
    }
    
}
