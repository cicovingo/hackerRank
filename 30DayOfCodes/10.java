import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        boolean before = false;
        int count1 = 0;
        int max = 0;
        while(n>=2){
            if(n%2==1){
                if(before)
                    count1++;
                else {
                    before = true;
                    count1++;
                }
            } else {
                if(max<count1)
                    max=count1;
                count1=0;
                before = false;
            }
            n = n/2;
        }
        if(n==1)
            count1++;
        if(max<count1)
            max=count1;
        System.out.println(max);
        scanner.close();
    }
}
