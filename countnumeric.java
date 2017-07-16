import java.util.*;
public class countnumeric {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int temp=0;
        int count=0;
       String str=in.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
        if(Character.isDigit(ch[i]))
        {
            count++;
        }
        else
        {
            temp++;
        }
            }
        System.out.print(count);
    }
}
