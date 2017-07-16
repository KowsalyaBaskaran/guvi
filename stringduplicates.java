import java.util.*;
public class stringduplicates {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        {
            for(int i=0;i<str.length();i++)
            {
                for(int j=i+1;j<str.length();j++)
                {
                if(ch[i]==ch[j])
                {
               
                    ch[j]='@';
                }
                else
                {
                    int temp=0;
                }
            }
            }
            for(int i=0;i<str.length();i++)
            {
            if(ch[i]!='@')
            {
                System.out.print(ch[i]);
            }
        }}
        
    }
}
