import java.util.*;
public class vow_or_digit {
    public static void main(String srgs[])
    {

      System.out.println("Please enter a single character: ");
      Scanner in=new Scanner(System.in);
  char ch = in.next().charAt(0);

  System.out.println(ch);

  if ((ch>='a'|| ch>='z')&&(ch>='A'||ch>='Z')) {
      System.out.println("The character entered is a letter.");
        }
  else
      System.out.println("it is a number");}
}
