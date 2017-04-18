

import java.util.*;
public class odd{
    public static void main(String args[])
    {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the interval values");
             a=in.nextInt();
             b=in.nextInt();
             for(int i=a;i<b;i++)
             {
                 if(i%2!=0)
                 {
                     System.out.println(i);
                 }
             }
    }
    }

