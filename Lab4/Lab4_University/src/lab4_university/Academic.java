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
public class Academic extends staff {
   String subject;
   public Academic(){
       
   }
   public Academic(String name,int age,String subject){
       super(name,age);
       /*this.name=name;
       this.age=age;*/
       this.subject=subject;
   }
   public void teachSubject(){
       System.out.println("teach : "+subject);
   }
}
