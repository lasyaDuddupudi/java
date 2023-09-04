import java.io.*;
import java.util.*;
public class ElseIfExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of 3 subjects");
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        float avg=(total)/3;
        System.out.println("The total marks of student is"+total);
        if(avg>=75)
        {
            if(avg>=95)
            {
                System.out.println("student avg is"+avg+"your avg is top5");
            }
                else if(avg>=90)
                {
       
                System.out.println("student avg is"+avg+"your avg is top10");
                   
                }
            else
            {
            System.out.println("student avg is"+avg+"student passed with distinction");
            }
        }
        else if(avg>=60&&avg<75)
        {
            System.out.println("student avg is"+avg+"student passed in first class");
        }
        else
        {
            System.out.println("student failed");
        }
    }
}


