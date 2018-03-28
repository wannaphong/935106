using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace check_stu
{
    public class Classroom
    {
        public string classroomID;
        public string name;
        public string[] Student;
        private db data = new db();

        public List<Student> ShowStudent()
        {
            List<Student> stu_data = new List<Student>();
            for(int i = 0; i < data.getdata().Length; i++)
            {
                Student stu_num = new Student();
                stu_num.student_id = data.getdata()[i].Split(',')[0];
                stu_num.student_name = data.getdata()[i].Split(',')[1];
                stu_data.Add(stu_num);
            }
            return stu_data;
        }
        public void Call()
        {
            int week = 0;
            Console.WriteLine("มา 1 ขาด 2 ลา 3");
            Console.WriteLine("สัปดาห์ที่ : ");
            week = int.Parse(Console.ReadLine());
            var data_stu_all = ShowStudent().ToArray();
            for (int i = 0; i < data_stu_all.Length; i++)
            {
                Console.WriteLine("ชื่อ : "+ data_stu_all[i].student_name+" รหัส : "+data_stu_all[i].student_id);
                Console.Write("สถานะ : ");
                int week2 = int.Parse(Console.ReadLine());
                data.check_add(i + 1, week, week2);
            }
            data.save();
        }
    }
}
