import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int i;
        String ss = scanner.next();
        for(i=0;i<s;i++){
            String s1="";
            String s2="";
            int j;
            char[] charArray = ss.toCharArray();
            for(j=0;j<ss.length();j++){
                if(j%2==0){
                    s1=s1+charArray[j];
                } else {
                    s2=s2+charArray[j];
                }
            }
            System.out.println(s1+" "+s2);
            if(scanner.hasNext())
                ss = scanner.next();
        }
    }
}