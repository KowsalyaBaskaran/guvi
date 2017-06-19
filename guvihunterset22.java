
import java.util.*;
public class guvihunterset22 {
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a[]=new int[50];
for(int i=0;i<50;i++)
{
    a[i]=in.nextInt();
    
}Arrays.sort(a);
System.out.println(a[45]);
for(int i=0;i<50;i++)
{
    System.out.println(a[i]);
}
}
}
