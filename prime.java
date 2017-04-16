
import java.util.*;
public class prime {
    public static void main(String args[])
    {
        int i,m=0,flag=0;
        int n=17;
        m=n/2;
        for(i=2;i<m;i++)
        {
            if(n%2==0)
            {
                System.out.println("not prime");
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        {
            System.out.print("prime");
        }
    }
    
}
