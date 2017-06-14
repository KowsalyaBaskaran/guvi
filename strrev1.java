import java.util.*;
public class strrev1 {
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String s2[]=s1.split(" ");
    String stringreverse="";
    for(int i=0;i<s2.length;i++)
    {
        String word=s2[i];
        String reverseword="";
        for(int j=word.length()-1;j>=0;j--)
        {
            reverseword=reverseword+word.charAt(j);
        }
        stringreverse=stringreverse+reverseword+" ";
    }
  System.out.println(stringreverse);
}
}
