/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2class;

/**
 *
 * @author wannaphong
 */
public class Profile {
    String name="Wannaphong",id="603410214-3";
    public Profile() { // constructor formed 1
        //System.out.println("ssssssss");
        String stu_id=id,Name=name;
        System.out.println("Student ID is "+stu_id);
        System.out.println("My name is "+Name);
    }
    public Profile(String stu_id,String Name){
        System.out.println("Student ID is "+stu_id);
        System.out.println("My name is "+Name);
    }
    /*public String getName(){
        return name;
    }
    public void getID(String stu_id,String major){
        /*System.out.println(id);
        System.out.println("So What ?");
        System.out.println(stu_id+" "+major);
    }*/
}
