using System;
using System.Windows.Forms;

namespace week1
{
    public partial class Form1 : Form
    {
        string text = System.IO.File.ReadAllText("data.txt");
        Student s = new Student();
        string[] data;
        public void readdata()
        {
            data= text.Split('*');
        }
        public Form1()
        {
            InitializeComponent();

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string selected = comboBox1.Text;
            readdata();
            string[] y1,y2,y3;
            // MessageBox.Show(selected);
            //MessageBox.Show(data[0]);
            foreach(var y in data)
            {
                y1 = y.Split(new[] { Environment.NewLine },StringSplitOptions.None);
                 //MessageBox.Show("0 : "+y1[1]);
                y2 = y1[0].Split(',');
               // MessageBox.Show("1 :"+y2[0]);
               if (y2[0].Equals(selected))
                {
                    //MessageBox.Show(y1[1]);
                    //= string.Join("\n", y);
                    string t = "";
                   // Console.WriteLine(y1[2]);
                    
                        foreach (var d in y1)
                        {
                        if (!d.Equals(""))
                        {
                            // Console.WriteLine("S" + d);
                            string txt = "";
                            y3 = d.Split(',');
                            Student stu = new Student();
                            stu.year = y3[5];
                            txt += "\r\nปี " + stu.year+"\r\n";
                            stu.name = "ชื่อ "+ y3[0];
                            txt += stu.name + "\r\n";
                            stu.nickname = "ชื่อเล่น " +y3[1];
                            txt += stu.nickname + "\r\n";
                            stu.program ="สาขา"+ y3[2];
                            txt += stu.program + "\r\n";
                            stu.younger_person = y3[4].Split('-');
                            stu.elder_person = y3[3].Split('-'); 
                            txt += "น้องรหัส" + "\r\n";
                            foreach (var data in stu.younger_person)
                            {
                                txt += "- "+data + "\r\n";
                            }
                            txt += "พี่รหัส" + "\r\n";
                            foreach (var data in stu.elder_person)
                            {
                                txt += "- " + data + "\r\n";
                            }
                            t += txt; //stu.name + "\r\n" + stu.nickname + "\r\n" + stu.program + "\r\n" + string.Join("\r\n", stu.younger_person) + "\r\n" + string.Join("\r\n", stu.elder_person) + stu.year + "\r\n\r\n";
                        }
                    }
                        data_show.Text = t;
                        break;
                    
                }
               // MessageBox.Show(y1[1]);
            }
        }
    }
}
