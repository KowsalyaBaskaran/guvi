import java.util.Scanner;

public class reverse2
{
    public static void main(String args[])
    {
        int num, rev=0, rem;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
		
        System.out.print("Reverse = " +rev);
    }
}

