using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace check_stu
{
    class db
    {
        private string pathfile = AppDomain.CurrentDomain.BaseDirectory + "รายชื่อ.txt";
        private string[] data = System.IO.File.ReadAllLines(AppDomain.CurrentDomain.BaseDirectory + "รายชื่อ.txt");
        public string[] list_name()
        {
            List<string> list = new List<string>();
            for(int i = 0; i < data.Length; i++)
            {
                list.Add(data[i].Split(',')[0]);
            }
            return list.ToArray();
        }
        public string[] getdata()
        {
            return this.data;
        }
        public void check_add(int num, int week,int checkname)
        {
            string[] data_num = data[num - 1].Split(',');
            data_num[2 + week - 1] = checkname.ToString();
            data[num - 1]=string.Join(",", data_num);
        }
        public void save()
        {
            System.IO.File.WriteAllText(pathfile, string.Join("\n'" , data));
        }
    }
}