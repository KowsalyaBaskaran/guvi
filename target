import java.util.*;
public class kdigitsdeleting {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int target=in.nextInt();
        int tem=0;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextInt();
           
       }
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;i<n;i++)
           {
               tem=a[i]+a[j];
               if(tem==target)
               {
                  tem=target;
             
               }
           }
       }
       if(tem==target)
       {
       System.out.print("yes");
    }
    else
       {
           System.out.print("no");
       }}}
