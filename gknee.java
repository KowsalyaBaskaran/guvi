import java.util.*;
public class gknee {
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       System.out.println("enter the table");
       int a=in.nextInt();
       System.out.println("enter the limit");
       int b=in.nextInt();
       //int c[]=new int[b];
       for(int i=1;i<=b;i++)
       {
           int d=i*a;
           System.out.println(i+"*"+a+"="+d);
       }
    }
}
