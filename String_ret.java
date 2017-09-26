import java.util.*;
public class String_ret {
    public static void main(String args[])
    {
        String s1="";
        String s2="";
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        s2=in.nextLine();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a+b;
        String d=String.valueOf(c);
        System.out.println(c);
    }
}
