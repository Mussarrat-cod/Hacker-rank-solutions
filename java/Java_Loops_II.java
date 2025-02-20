import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int i;
       for(i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
        int n;
        for(n=1;n<=m;n++)
        {
        
       int k= (int)Math.pow(2,n);
         int result=a+(k*b);
        System.out.printf("%d ",result-b);
        int result1;
        int h=(int)Math.pow(2,n+1);
        //result1=result+(h*b);
        //System.out.println(result1);
        }
        System.out.printf("\n");
       }
} 
}
