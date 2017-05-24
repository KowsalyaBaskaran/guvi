import java.util.*;
public class fact {
  public static void main(String args[])
  {
      int i;
      int num;
      int fact=1;
      Scanner in=new Scanner(System.in);
      
      System.out.println("enter the number");
      num=in.nextInt();
      for(i=1;i<=num;i++)
      {
          fact=fact*i;
      }
      System.out.println(fact);
  }
}
