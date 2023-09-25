import java.io.*;
class CounterDemo
{
    static int count=0;
    CounterDemo()
    {
        count++;
        System.out.println("count="+count);
    }
}
public class VariableDemo2{
    public static void main(String args[])
    {
        CounterDemo cd=new CounterDemo();
        CounterDemo cd1=new CounterDemo();
        CounterDemo cd2=new CounterDemo();
    }
}
