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
public class Employee {
    public String name;
    private double salary,bonus;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        this.bonus=(salary*15)/100;
    }
    public double getSalary(){
        return this.salary;    }
    public double getBonus(){
        return this.bonus;    }
}
