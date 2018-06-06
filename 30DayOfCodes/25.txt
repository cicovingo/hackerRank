import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 0;
        while(i-1>=0){
            int a = sc.nextInt();
            if(a!=1){
                int k;
                boolean isPrime = true;
                for(k=2;k<=a/2;k++){
                    if(a%k==0&&a!=k){
                        System.out.println("Not prime");
                        isPrime = false;
                    }
                    if(!isPrime)
                        break;
                }
                if(isPrime)
                    System.out.println("Prime");
            } else
                System.out.println("Not prime");
            i--;
        }
    }
}
