import java.util.*;
public class leng{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=0;
        int k[]=new int[n];
        for(int i=0;i<n;i++)
        {
            k[i]=in.nextInt();
        }for(int i=0;i<k.length;i++)
        {
            for(int j=i+1;j<k.length;j++)
            {
               if((k[i]==k[j])&&(temp==0))
               {
                        temp++;       
                  
                    System.out.println(k[i]);
                    break; 
               }
        }
        }
        
    
}}
