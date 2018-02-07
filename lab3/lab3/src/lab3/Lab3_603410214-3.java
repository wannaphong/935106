/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author wannaphong
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Employee Emp1 = new Employee();
        Employee Emp2 = new Employee();
        String Emp_name1=Emp1.setName("miw");
        String Emp_name2=Emp2.setName("ton");
        
        System.out.println("name = "+ Emp_name1+"\n"+"name = "+ Emp_name2);*/
       /* Employee Emp1 = new Employee("Ton",58341,120000);
        Employee Emp_bonus = new Employee();
        System.out.println("name : "+Emp1.name+"\n"+"id : "+Emp1.id+"\n"+"salary : "+Emp1.salary);
        System.out.println("bonus+salary : "+(Emp_bonus.bonus+Emp1.salary));*/
       Employee Emp = new Employee("Folk",10000);
       System.out.println("name : "+Emp.name+"\n"+"salary : "+Emp.getSalary()+"\n"+"bonus : "+Emp.getBonus());
    }
}