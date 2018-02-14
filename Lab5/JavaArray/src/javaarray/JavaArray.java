package javaarray;

import java.util.Scanner;

/**
 *
 * @author wannaphong
 */
public class JavaArray {
    public static void main(String[] args) {
        ArrayClass arrayclass=new ArrayClass();
        System.out.print("Number for friend : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        arrayclass.AddArrayList(n);
        /*for(int i=0;i<array_split.length;i++ ){
            System.out.println((i+1)+" "+array_split[i]);
        }*/
    }
}