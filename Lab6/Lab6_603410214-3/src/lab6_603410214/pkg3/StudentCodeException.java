/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_603410214.pkg3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author wannaphong
 */
public class StudentCodeException extends Exception  {
    String[] data="593410273-6,603410032-9,603410034-5,603410041-8,603410046-8,603410047-6,603410052-3,603410056-5,603410057-3,603410059-9,603410060-4,603410061-2,603410063-8,603410065-4,603410067-0,603410070-1,603410071-9,603410073-5,603410155-3,603410156-1,603410157-9,603410194-3,603410196-9,603410200-4,603410202-0,603410203-8,603410204-6,603410206-2,603410208-8,603410210-1,603410211-9,603410213-5,603410214-3,603410215-1,603410217-7,603410218-5,603410219-3,603410220-8,603410221-6,603410222-4,603410223-2,603410289-2,603410291-5,603410309-2,603410319-9,603410320-4,603410321-2".split(",");    public StudentCodeException(){
        super();
    }
    public StudentCodeException(String message){
        super(message);
    }
    public boolean checkStudentId(String studentID) throws StudentCodeException, IOException{
        String[] student=studentID.split("-");
        boolean istrue=false;
        if(student.length!=2) throw new StudentCodeException("Wrong!!! xxxxxxxxx-x !!!");
        else if(student[0].length()!=9||student[1].length()!=1) throw new StudentCodeException("Wrong!!! xxxxxxxxx-x !!!");
        else{
            try{
            Integer.parseInt(student[0]);
            Integer.parseInt(student[1]);
            for(int i=0;i<data.length;i++){
            if(data[i].equals(studentID)){
                istrue= true;
            }
           }
        }
            catch(Exception ex){
                throw new StudentCodeException("Wrong!!! xxxxxxxxx-x !!!");
            }
            
        }
        return istrue;
        
    }
}
