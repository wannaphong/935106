/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
public class JavaError extends Exception {
    public JavaError(){
        super();
    }
    public JavaError(String message){
        super(message);
    }
    public boolean checkStudentId(String studentID) throws JavaError{
        if(studentID.length()!=10) throw new JavaError("Wrong ID !!!");
        return true;
    }
}
