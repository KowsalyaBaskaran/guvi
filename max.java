import java.util.*;
public class max {
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the numbers");
        int a=in.nextInt();
        int b=in.nextInt();
            int c=in.nextInt();
       if(a>b&&a>c)     {
             System.out.println(a);             
       }
       if(b>c&&b>a) {
      System.out.println(b);
            }
    if(c>b&&c>a) {
        System.out.println(c);
    }
}}
