/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_603410214.pkg3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author wannaphong
 */
public class chat_server extends javax.swing.JFrame {

    /**
     * Creates new form chat_server
     */
    static ServerSocket ss; // กำหนดส่งทางการติดต่อสื่อสาร
    static Socket s;
    static DataInputStream din; // ส่งค่าเข้าเชิฟ
    static DataOutputStream dout; // ส่งค่าออกจากเชิฟ
    public chat_server() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBot");

        jTextField1.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("send");
        jButton1.setDoubleBuffered(true);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String magout=jTextField1.getText();
            dout.writeUTF(magout);
            jTextArea1.setText(jTextArea1.getText()+"Server: "+magout+"\n");
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static ArrayList<String> icu_word_segmentation(String txt){
        /**
         * ตัวตัดภาษาไทย โดยใช้ IBM ICU
         */
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
    
    public static String chatbot(String txt){
        /*
        ส่วนสำหรับกำหนดการโต้ตอบของ ChatBot
        */
        Random rand = new Random(); 
        String data="";
        txt=txt.toUpperCase();
        ArrayList<String> text=icu_word_segmentation(txt);
        if(text.contains("สวัสดี") || (text.contains("หวัด")&&text.contains("ดี"))||(text.contains("จ้า")&&text.contains("ดี"))||text.contains("HI")||text.contains("HELLO")){
            String[] hi={"ดีจ้า","สวัสดีค่ะ","ว่าไง","จ้า","หวัดดีค่ะ"};
            int value =rand.nextInt(hi.length);
            data=hi[value];
        }
        else if(text.contains("ร้องเพลง")){
            data="ลา..มะลิลา...\nขึ้นต้นเป็นมะลิซ้อน\nพอแตกใบอ่อนเป็นมะลิลา ^^";
        }
        else if(text.contains("เวลา")||(text.contains("วัน")&&text.contains("นี้"))){
            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            data="วันเวลาปัจจุบันนี้คือ "+df.format(c.getTime());
        }
        else if(text.contains("แปลง")&&text.contains("USD")&&text.contains("THB")){
            double i=0,thb=0,usd=0,num=-1;
            for(int j=0;j<text.size();j++){
                if(text.get(j).equals("USD")){
                    usd=j;
                }
                else if(text.get(j).equals("THB")){
                    thb=j;
                }
                else{
                    try{
                        Double.parseDouble(text.get(j));
                        num=Double.parseDouble(text.get(j));
                    }
                    catch(Exception e){
                    }
                }
            }
            if(usd<thb && num!=-1){
                data="แปลงจาก "+String.valueOf(num)+" USD ได้เป็น "+String.valueOf(num*30)+" THB";
            }
            else if(usd>thb && num!=-1){
                data="แปลงจาก "+String.valueOf(num)+" THB ได้เป็น "+String.valueOf(num/30)+" USD";
            }
            else{
                data="ขออภัยค่ะ คุณไม่ได้กำหนดจำนวนมาค่ะ";
            }
        }
        else if(text.contains("ฐาน")&&text.contains("สอง")&&text.contains("สิบ")){
            int i=0,two=0,ten=0,num=-1;
            for(int j=0;j<text.size();j++){
                if(text.get(j).equals("สอง")){
                    two=j;
                }
                else if(text.get(j).equals("สิบ")){
                    ten=j;
                }
                else{
                    try{
                        Integer.parseInt(text.get(j));
                        num=Integer.parseInt(text.get(j));
                    }
                    catch(Exception e){
                    }
                }
            }
            if(two<ten && num!=-1){
                data="แปลงจาก "+String.valueOf(num)+" ฐานสอง เป็น ฐานสิบ ได้ "+String.valueOf(Integer.parseInt(String.valueOf(num), 2));
            }
            else if(two>ten && num!=-1){
                data="แปลงจาก "+String.valueOf(num)+" ฐานสิบ เป็น ฐานสอง ได้ "+String.valueOf(Integer.toBinaryString(num));
            }
            else{
                data="ขออภัยค่ะ คุณไม่ได้กำหนดเลขมาค่ะ";
            }
        }
        else{
            data="ขออภัย ข้อความนี้ไม่อยู่ในคำสั่งที่รองรับค่ะ TT";
        }
        return data;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        chat_server cs = new chat_server();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_server().setVisible(true);
                
            }
        });
        try {
            ss = new ServerSocket(8081);
            s = ss.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            String msg="";
            while(!msg.equals("exit")){
                msg=din.readUTF().toString();
                jTextArea1.setText(jTextArea1.getText()+"Client: "+msg+"\n");
                String chatbot_meg = chatbot(msg);
                System.out.print(chatbot_meg.toString());
                dout.writeUTF(chatbot_meg);
                jTextArea1.setText(jTextArea1.getText()+"ChatBot: "+chatbot_meg+"\n");
            }
        } catch (Exception ex) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
