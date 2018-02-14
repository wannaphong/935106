/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray;

import java.util.ArrayList;

/**
 *
 * @author wannaphong
 */
public class ArrayClass {
    ArrayList<String> arrayList = new ArrayList<>();
    public void AddArrayList(String[] text){
        for(int i=0;i<text.length;i++){
            this.arrayList.add(text[i]);
        }
    }
    public void ShowArrayList(){
        for(int i=0;i<arrayList.size();i++){
            System.out.println("ตำแหน่งที่"+i+" = "+arrayList.get(i));
        }
    }
}
