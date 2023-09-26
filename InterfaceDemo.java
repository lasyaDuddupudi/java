import java.io.*;
interface Language
{
    void getName(String name);
}
class ProgrammingLanguage implements Language
{
  public void getName(String name)
    {
        System.out.println("my favourite programming language is "+name);
    }
}
public class InterfaceDemo
{
    public static void main(String args[])
    {
        ProgrammingLanguage pl=new ProgrammingLanguage();
        pl.getName("java");
    }
}
