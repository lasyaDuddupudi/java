import java.util.*;
public class DemoPrimev4{
    public static void main(String args[]){
        int i,num,flag,j;
       System.out.println("Enter num value");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       System.out.println("prime numbers between 1 to"+num+"are :");
       for(j=2;j<num;j++)
       {
           flag=0;
           for(i=1;i<j;i++)
            {
                if(j%i==0)
                {
                    flag++;
                }
        }
        if(flag==2)
        {
            System.out.println(j+" ");
        }
    }
}
}
