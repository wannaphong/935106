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
        Map students = new HashMap();
        students.put("Ta", "4.00");
        students.put("Mo", "3.57");
        students.put("na", "2.59");
        System.out.println(students.get("Mo"));
        
        Map<String,String> staff=new HashMap();
    }
    
}
