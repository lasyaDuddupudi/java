import java.io.*;
class Student
{
    int rollno;
    String name;
    float Fees;
    Student(int rollno,String name,float Fees)
    {
        this.rollno = rollno;
        this.name = name;
        this.Fees = Fees;
    }
    void display()
    {
        System.out.println("The student details are");
        System.out.println(+rollno+" "+name+" "+Fees+" ");
    }
 }
public class ThisDemo1
 {
     public static void main(String args[])
     {
         Student s1=new Student(4221,"priya",125000);
         s1.display();
     }
 }
