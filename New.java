
import java.util.*;
public class New {
    public static void main(String args[])
    {
        Scanner kd=new Scanner(System.in);
       System.out.println("enter the value of n");
        int n=kd.nextInt();
      
        System.out.println("enter the numbers");
         int div[]=new int[n];
        for(int i=0;i<n;i++)
        {
       div[i]=kd.nextInt();
        }
        System.out.println("enter the key value");
        int k=kd.nextInt();
        int j;
     
       for(int i=k;i<n;i++)
       {
           System.out.println(div[i]);
       }
        for(int i=0;i<k;i++)
       {
           System.out.println(div[i]);
       }
                
    }
}
