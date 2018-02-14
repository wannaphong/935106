/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_603410214.pkg3;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class Lab5_6034102143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Class_Array arr_List = new Class_Array();
        Scanner scan=new Scanner(System.in);
        System.out.print("Number input : ");
        int count=scan.nextInt();
        String[] in_name=new String[count];
        //int i=0;
        System.out.print("\n");
        for(int i=0;i< count;i++){
            System.out.println("Input Name: ");
            in_name[i]=scan.nextLine();
        }
        arr_List.Addarry_List(in_name);
        System.out.print("You want to show info Yes or No ? : ");
        String str=scan.nextLine();
        if(str.equals("Yes")){
            arr_List.ShowArrayList();
        }
    }
    
}
