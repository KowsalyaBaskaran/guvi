import java.util.*;
public class happy {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int remainder;
        int result=0;
        while(number>0)
        {
            remainder=number%10;
            result=result+(remainder*remainder);
            number=number/10;
            if((result!=1)&&(number==0))
                    {
               number=result;
              result=0;
               
                    }
        }
        if(result==1)
                {
                    System.out.println(number+"is a happy number");
                }
        else
        {
            System.out.println("false");
        }
    }
}
