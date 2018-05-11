/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author wannaphong
 */
public class shop {
    private HashMap<String,Double> shop_member = new HashMap<String,Double>();
    public void add(String name,Double p){
        if(shop_member.containsKey(name)){
           shop_member.replace(name, p+shop_member.get(name));
        }
        else{
           shop_member.put(name, p);
        }
    }
    public double check_p(String name){
        return Double.parseDouble(shop_member.get(name).toString());
    }
    public double cal(String cake,Double p){
        double p_cal=0;
        if(cake.equals("milk cake")){
            p_cal=45*p;
        }
        else if(cake.equals("grape cake") ){
            p_cal=54*p;
        }
        else if(cake.equals("orange cake") ){
            p_cal=47*p;
        }
        return p_cal*0.1;
    }
    public String cal_output(String cake,Double p,Boolean isp){
        double p_cal=0,total=0;
        if(cake.equals("milk cake")){
            total=(45*p);
        }
        else if(cake.equals("grape cake") ){
            total=(54*p);
        }
        else if(cake.equals("orange cake") ){
            total=(47*p);
        }
        p_cal=total*0.1;
        if(isp.equals(true)){
            return "total "+String.valueOf(total) +"฿, +"+String.valueOf(p_cal);
        }
        else{
            return "total 0฿";
        }
        
    }
    public boolean save(String text){
        try{
            String[] data=text.split(",");
            String name=data[0].split("->")[1];
            String item=data[1].split("->")[1];
            String p=data[2].split("p")[0];
            add(name,cal(item,Double.parseDouble(p)));
            System.out.println(cal_output(item,Double.parseDouble(p),true));
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean save_using_p(String text){
        try{
            String[] data=text.split(",");
            String name=data[0].split("->")[1];
            String item=data[1].split("->")[1];
            String p=data[2].split("p")[0];
            if(check_p(name)>=100&&cal(item,Double.parseDouble(p))<=check_p(name)){
                add(name,cal(item,Double.parseDouble(p))*-1);
                System.out.println(cal_output(item,Double.parseDouble(p),false));
            }
            else{
                 System.out.println("ไม่มีคะแนน");
            }
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
