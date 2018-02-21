/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_603410214.pkg3;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class Lab6_6034102143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* try{
            StudentCodeException st=new StudentCodeException();
        }
        catch(Exception ex){
            
        }*/
       try{
           Scanner sc=new Scanner(System.in);
          StudentCodeException studentCodeException = new StudentCodeException();
          System.out.print("Student ID (ex. xxxxxxxxx-x) : ");
          boolean is_stu= studentCodeException.checkStudentId(sc.nextLine());
          if(is_stu==true){
              System.out.println("Yes,It is student in Java OOP.");
          }
          else{
              System.out.println("No,It isn't student in Java OOP.");
          }
        }
       catch(StudentCodeException ex){
            System.out.println("Wrong Student ID Format:"+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Program can't run completely because can not found arguments index : "+ex.getMessage());
        }
    }
    
}
