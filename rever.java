import java.util.*;
public class rever
{
    public static void main(String args[])
    {
        String reverse="";
        String original;
System.out.println("enter the string");
Scanner in=new Scanner(System.in);
original=in.next();
int length=original.length();
for(int i=length-1;i>=0;i--)
{
    reverse=reverse+original.charAt(i);
    
}
System.out.println(reverse);
    }
}
