package javaarray;

/**
 *
 * @author wannaphong
 */
public class JavaArray {
    public static void main(String[] args) {
        ArrayClass arrayclass=new ArrayClass();
        String array_name="air,got,aun,kie,fern";
        String[] array_split=array_name.split(",");
        for(int i=0;i<array_split.length;i++ ){
            System.out.println((i+1)+" "+array_split[i]);
        }
        arrayclass.AddArrayList(array_split);
    }
}