import java.util.*;
public class arr {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int temp=0;
        
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=in.nextInt();
        }for(int i=0;i<5;i++)
        {
            if(ar[i]==i)
            {
                temp=0;
            }
            
        }if(temp==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
    }
}
