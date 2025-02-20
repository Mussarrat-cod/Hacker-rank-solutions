import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args){
        Scanner obs=new Scanner(System.in);
        int x=obs.nextInt();
        int i,n;
        for(i=1;i<11;i++)
        {
            n=i*x;
            System.out.printf("%d x %d = %d%n", x, i, n);
            
        }
    }
}
