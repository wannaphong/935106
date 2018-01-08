using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
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
            string[] y1,y2;
            // MessageBox.Show(selected);
            //MessageBox.Show(data[0]);
            foreach(var y in data)
            {
                y1 = y.Split(new[] { Environment.NewLine },StringSplitOptions.None);
               // MessageBox.Show("0 : "+y1[1]);
                y2 = y1[1].Split(',');
               // MessageBox.Show("1 :"+y2[0]);
               if (y2[0].Equals(selected))
                {
                    MessageBox.Show(y1[y1.Length-2]);
                    break;
                }
            }
        }
    }
}
