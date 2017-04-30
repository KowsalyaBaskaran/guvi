import java.util.*;
public class multiply {
    public static void main(String args[]){
        int a,b,num=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit");
      
        b=in.nextInt();
        System.out.println("enter the required table");
       a=in.nextInt();
       
        for(int i=1;i<=b;i++)
        {
            num=i*a;
            System.out.println(i+"*"+a+"="+num);
        }
    }
}
