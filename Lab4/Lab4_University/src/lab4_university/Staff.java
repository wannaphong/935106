/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_university;

/**
 *
 * @author wannaphong
 */
public class Staff {
    String name;
    int age;
    
    public Staff(){
        
    }
    public Staff(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("I'm "+age+" years old");
    }
}
