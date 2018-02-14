/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class JavaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String,Double> payments=new HashMap();
       payments.put("THB",0.0);
       payments.put("USD",0.0);
       payments.put("JPY",0.0);
       payments.put("LAK",0.0);
       // input 10 THB, 20 USD, 2 USD
       Scanner s = new Scanner(System.in);
       System.out.print("input THB,USD,JPY,LAK : ");
       String[] num= s.nextLine().split(",");
       for(Map.Entry<String,Double> data:payments.entrySet()){ // นี่คือลูป for in ใน java จะดึงเอาข้อมูลทีละ index มาใส่ใน data จาก students
            if(data.getKey().equals("THB")) data.setValue(Double.parseDouble(num[0]));
            else if(data.getKey().equals("USD"))  data.setValue(Double.parseDouble(num[1]));
            else if(data.getKey().equals("JPY"))  data.setValue(Double.parseDouble(num[2]));
            else if(data.getKey().equals("LAK"))  data.setValue(Double.parseDouble(num[3]));
            System.out.println(data.getKey()+"/"+data.getValue());
        }
       
    }
    
}
