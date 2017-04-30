public class armstrong {
    public static void main(String args[])
    {
        int a,b=0,temp=10;
        int n=371;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
         b=b+(a*a*a);
        }
         if(temp==b)
         {
             System.out.println("armstrong");
         }
         else
         {
             System.out.print("not armstrong");
         }
        }
        
    }

