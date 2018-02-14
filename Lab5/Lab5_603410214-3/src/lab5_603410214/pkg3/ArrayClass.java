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
public class ArrayClass {
    ArrayList<String> arrayList = new ArrayList<>();
    public void AddArrayList(int num){
        String[] text=new String[num];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<text.length;i++){
            System.out.print("Input name "+(i+1)+" : ");
            text[i] = scan.nextLine();
            this.arrayList.add(text[i]);
        }
    }
    public void ShowArrayList(){
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
