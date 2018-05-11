/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author wannaphong
 */
public class Cal {

    /**
     * @param args the command line arguments
     */
    private int num11=0;
    private int num22=0;
    public Cal(int num1,int num2){
        this.num11=num1;
        this.num22=num2;
     }
    public int plue(){
        return num11+num22;
    }
    public int del(){
        return num11-num22;
    }
    
}
