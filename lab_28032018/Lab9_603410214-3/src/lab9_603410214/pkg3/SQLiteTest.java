/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_603410214.pkg3;

/**
 *
 * @author wannaphong
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLiteTest{
   private static Connection con;//ประกาศค่าคงที่ Class ของ Connection ซึ่งเป็นคลาสในการเชื่อมต่อระบบฐานข้อมูลต่างๆ
   private static boolean hasData = false;

   public ResultSet displayUsers() throws ClassNotFoundException,SQLException{
      if(con == null)//ทำการเช็ดว่ามีการเชื่อมต่อ ฐานข้อมูลหรือไม่
      {
         getConnection();
      }
        
      Statement state = con.createStatement();//เป็น Class ที่ใช้ในการเอาคำสั่งภาษาอื่นมาใช้
      ResultSet res = state.executeQuery("SELECT id,fname,lname FROM student");//แสดงผลออกมาโดยใช้การเรียก executeQuery คือการเรียกดูข้อมูลจาก Database และ table ทีมีชื่อว่า student
      return res;
   }

    public void getConnection() throws SQLException, ClassNotFoundException{
      Class.forName("org.sqlite.JDBC");//ประการเรียก SQLite
      con = DriverManager.getConnection("jdbc:sqlite:SQLTest.db");//ประการให้ทำการเชื่อมต่อตัวเครื่องกับฐานข้อมูลที่มีชื่อว่า SQLTest.db เพื่อใช้ในการดึงและส่งข้อมูลไปหากัน
      initialise();
    }
    public boolean tableExists(String tableName) throws SQLException, ClassNotFoundException{
        if(con == null)//ทำการเช็ดว่ามีการเชื่อมต่อ ฐานข้อมูลหรือไม่
      {
         getConnection();
      }
        try{
            DatabaseMetaData md = con.getMetaData();
            ResultSet rs = md.getTables(null, null, tableName, null);
            rs.last();
            return rs.getRow() > 0;
        }catch(SQLException ex){
          //  Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private void initialise() throws SQLException, ClassNotFoundException{//เมธอนค่าเริ่มต้นในการสร้าง table ของDatabase
        if(!hasData){//ถ้าhasData เท่ากับ False ให้ทำการเช็ดค่าว่ามี Tableตัวนี้อยู่หรือไม่
           hasData = true;
           
           Statement state = con.createStatement();
           ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='student'");//ทำการค้นหา ชื่อ จากTable sqlite_master          //ว่าtable ที่มีชื่อว่า student มีอยู่หรื่อไม่
           int size = 0;
          // if(size==-1 ){//res.next() ทำการเช็ดดูข้อมูลว่ามีอยู่หรือไม่
          if(tableExists("student"))
             System.out.println("Building the User table with prepopulated values.");
             
             Statement state2 = con.createStatement();
             state2.execute("CREATE TABLE IF NOT EXISTS student(id integer,"+"fName varchar(60), "+"lname varchar(60),"+"primary key(id));");//ทำการสร้าง table
             PreparedStatement prep = con.prepareStatement("INSERT INTO student ('fName','lname') VALUES(?,?);");//Class PreparedStatement มีไว้ในการเรียกใช้ฐานข้อมูลหลายๆครั้ง ทำการเพิ่มข้อมูล
             prep.setString(1, "Air");//ทำการเพิ่มข้อมูลไปที่Columns ที่ 2 (?,[?],?)
             prep.setString(2, "123456");
             //prep.execute();//และทำการเรียกใช้คำสั่ง
             prep.executeUpdate();
             con.commit();
             System.out.print(String.valueOf(res.getRow()));
             
           //}
        }
    }
    public void addUser(String firstname,String lastName) throws SQLException, ClassNotFoundException{//เพิ่มข้อมูลใน table
         if(con == null){
             getConnection();
         }
         PreparedStatement prep = con.prepareStatement("INSERT INTO student VALUES(?,?);");//ทำการเพิ่มข้อมูล
         prep.setString(2,firstname);
         prep.setString(3,lastName);
         prep.execute();
      }
    public void Delete(String id)throws SQLException,ClassNotFoundException{//ลบข้อมูล
      if(con == null){
         getConnection();
      }
      int dataID = Integer.parseInt(id);
      String query = "DELETE FROM student WHERE id=?";//ทำการลบ student ที่ id = ...
      PreparedStatement prep = con.prepareStatement(query);//ประกาศคำสั่ง
      prep.setInt(1, dataID);//ให้ ? = dataID ที่รับเข้ามาเพื่อทำการเช็ด
      prep.executeUpdate();//ทำการอัพเดท table
    }
}