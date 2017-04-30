import java.util.*;
 
public class fibb {
 public static void main(String args[]) 
 {
     int a,fact=1;
     Scanner in=new Scanner (System.in);
     int num=in.nextInt();
     for(int i=1;i<=num;i++)
     {
     fact=fact*i;
     
 }System.out.println(fact);
 }
}
