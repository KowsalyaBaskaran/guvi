import java.util.*;
public class nearzero{
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int a=in.nextInt();
        int n[]=new int[a];
        for(int i=0;i<n.length;i++)
        {
            n[i]=in.nextInt();
        }Arrays.sort(n);
        for(int i=0;i<n.length;i++)
            
        {
            sum=n[0]+n[1];
        }
        System.out.println(sum);
    }
}
