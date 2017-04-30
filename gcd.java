import java.util.*;
class gcd
    {
        public static void main(String args[])
        {
Scanner in=new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=in.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=in.nextInt();
            int hcf=0;
            int min = Math.min(n1,n2);
             
            for(int i=min; i >= 1; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    hcf = i;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
        }
    }
