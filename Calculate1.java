import java.io.* ;
public class Calculate1
{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String args[])
    {
        int result=Calculate.cube(5);
        System.out.println("cube of 5 is "+result);
    }
}
