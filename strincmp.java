import java.util.*;
public class Strincmp {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int count=0;
        char k=0;
        String str=in.next();
        char[] ch=str.toCharArray();
       int len=ch.length;
       for(int i=0;i<len;i++)
       {
           for(int j=i+1;j<len;j++)
           {
               if(ch[i]==ch[j])
               {
                    k=ch[i];
                   count++;
               }
           }
       }System.out.println(count);
       System.out.println(k);
       
    }
}
