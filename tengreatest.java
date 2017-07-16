import java.util.*;
public class tengreatest {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int max=0;
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            n[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
        if(n[i]>max)
        {
            max=n[i];
        }
            }
        System.out.print(max);
    }
}
