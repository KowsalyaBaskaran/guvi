import java.util.*;

public class palindrome {
    public static void main(String args[])
    {
        int r,sum=0;
        int num,temp;
        
        num=454;
        temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
            
        }
    }
}
