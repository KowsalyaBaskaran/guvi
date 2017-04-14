import java.util.*;
public class vowel {
  public static void main(String args[])
  {
      char let;
      System.out.println("enter the letter");
      Scanner in=new Scanner(System.in);
      let=in.next().charAt(0);
      if (let=='a'|| let=='A' || let=='e' || let=='E'||let=='i'||let=='I'||let=='o'||let=='O'||let=='u'||let=='U')
      {
          System.out.println("vowel");
      }else
      {
          System.out.println("consonant");
      }
  }
}
