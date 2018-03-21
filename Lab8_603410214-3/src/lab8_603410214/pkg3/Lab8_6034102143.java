/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_603410214.pkg3;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

/**
 *
 * @author wannaphong
 */
public class Lab8_6034102143 {

    /**
     * @param args the command line arguments
     */
    
    
   
    public ArrayList<String> icu_word_segmentation(String txt){
        Locale thaiLocale = new Locale("th");
        BreakIterator boundary = BreakIterator.getWordInstance(thaiLocale);
        boundary.setText(txt);
        StringBuffer strout = new StringBuffer();
        ArrayList<String> al = new ArrayList<String>();
        int start = boundary.first();
        for (int end = boundary.next();
            end != BreakIterator.DONE;
            start = end, end = boundary.next()) {
            al.add(txt.substring(start, end));
        }
        return al;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     /*   Lab8_6034102143 lab = new Lab8_6034102143();
        ArrayList<String> t= lab.icu_word_segmentation("ฐานสองเป็นสิบ");
      System.out.println(String.valueOf(t));*/
    }
    
    
}

