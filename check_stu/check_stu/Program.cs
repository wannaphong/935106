using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace check_stu
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("โปรแกรมเช็คชื่อ นศ. วิชา OOP");
            Classroom oop = new Classroom();
            oop.Call();
        }
    }
}
