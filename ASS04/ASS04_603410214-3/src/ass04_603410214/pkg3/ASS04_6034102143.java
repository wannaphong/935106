package ass04_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
public class ASS04_6034102143 {
    public static void main(String[] args) {
        Car car = new Car(); // เรียกใช้ class Car เป็นวัตถุ honda
        car.run(); // แสดงการวิ่งของรถ
        System.out.println(); // เว้นบรรทัด
        SuperCar honda=new SuperCar("honda",2,10,2); // เรียกใช้ class SuperCar ประกาศไว้ในตัวแปร honda โดยมีคุณสมบัติตามโจทย์ v=2,gass=10,gassUseRate=2
        honda.run();// แสดงการวิ่งของรถ
    }
}
