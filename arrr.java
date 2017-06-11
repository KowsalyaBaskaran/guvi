
import java.util.*;
public class arrr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int temp=0;
        int[] Ai=new int[N];
        for(int i=0;i<N;i++)
        {
            Ai[i]=in.nextInt();
        }for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(Ai[i]==Ai[j])
                {
                  Ai[i]=0;
                  Ai[j]=0;
                  
                }}}for(int i=0;i<Ai.length;i++)
                {
                    
                
                  if(Ai[i]!=0)  
                  {
                    System.out.println(Ai[i]);
                }
               
            }}}


