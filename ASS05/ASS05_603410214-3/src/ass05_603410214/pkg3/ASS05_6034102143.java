/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass05_603410214.pkg3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author wannaphong
 */
public class ASS05_6034102143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] local={{"usd","2500"},{"thb","47500"},{"usd","3500"},
            {"usd","2400"},{"thb","222300"},{"usd","2000"},
            {"usd","1500"},{"usd","8800"},{"thb","220"}
        };
        String[][] inter = {{"thb","2,500"},{"usd","500"},{"thb","10,500"},
            {"usd","200"},{"usd","500"},{"usd","2,500"},
            {"usd","2,500"},{"usd","2,500"},{"thb","209,500"}
        };
        ArrayList<String[]> arraylist = new ArrayList<String[]>();
        for(int i=0;i<inter.length;i++){
            arraylist.add(local[i]);
            arraylist.add(inter[i]);
        }
        ArrayList<Integer> thb = new ArrayList<Integer>();
        ArrayList<Integer> usd = new ArrayList<Integer>();
        for(int i=0;i<arraylist.size();i++ ){
            if(arraylist.get(i)[0].equals("thb")){
                thb.add(Integer.parseInt(arraylist.get(i)[1].replace(",", "") ));
            }
            else usd.add(Integer.parseInt(arraylist.get(i)[1].replace(",", "") ));
        }
        Integer[] THB = thb.toArray(new Integer[0]);
        Arrays.sort(THB);
        Integer[] USD = usd.toArray(new Integer[0]);
        Arrays.sort(USD);
        for(int data:THB){
            System.out.println(data+" THB");
        }
        System.out.println();
        for(int data:USD){
            System.out.println(data+" USD");
        }
    }
    
}
