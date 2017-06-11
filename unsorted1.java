import java.util.*;
public class leng{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
               if((a[i]==a[j])&&(temp==0))
               {
                        temp++;       
                  
                    System.out.println(a[i]);
                    break; 
               }
        }
        }
        
    
}}
