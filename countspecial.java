import java.util.*;
public class countspecial {
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
            temp++;
        }
        else if(Character.isAlphabetic(ch[i]))
        {
            temp++;
        }
        else
        {
            count++;
        }
            }
        System.out.print(count);
    }
}
