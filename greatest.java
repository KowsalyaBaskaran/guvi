import java.util.*;
public class greatest {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=0;
        if(a>b&&a>c)
        {
            System.out.print(a);
        }
        else if(b>a&&b>c)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }
    }
}
