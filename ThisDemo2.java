import java.io.*;
class Student{
    int rollno;
    String name;
    float fees;
    Student(int rollno,String name,float fees){
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }
    void display(){
        System.out.println("The student details are");
        System.out.println(+rollno+" "+name+" "+fees+" ");
    }
}
public class ThisDemo2{
    public static void main(String args[]){
        Student s1=new Student(4221,"priya",+125000);
        s1.display();
    }
}
