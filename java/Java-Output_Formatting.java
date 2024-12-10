import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
            int i;
            String[] s1=new String[3];
            int [] x=new int[3];
            System.out.println("================================");
            for( i=0;i<3;i++){
                 s1[i]=sc.next();
                 x[i]=sc.nextInt();
            }
            for( i=0;i<3;i++){
                //Complete this line
                System.out.println(String.format("%-15s%03d",s1[i],x[i]));
            }
            System.out.println("================================");



    }
}



