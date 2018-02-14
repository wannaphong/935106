/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_603410214.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
class Class_Array {
     ArrayList<String> arrayList = new ArrayList<>();
    public void Addarry_List(String[] text){
        for(int i=0;i<text.length;i++){
            this.arrayList.add(text[i]);
        }
    }
    public void ShowArrayList(){
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
