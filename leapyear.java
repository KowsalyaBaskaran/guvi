import java.util.*;
public class leapyear {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a%4==0)
        {
            System.out.print("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
