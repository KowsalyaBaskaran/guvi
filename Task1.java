import java.util.Scanner;
public class Task1 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=s.nextLine();
        int length=str.length();
        int count=0;
        for (int i = 0; i < length; i++) 
        {
            char c=str.charAt(i);
            count++;
            
        }
        System.out.println("No of Character is:"+count);
    }
}
