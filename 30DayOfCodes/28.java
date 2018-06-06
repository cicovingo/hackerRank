import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] names = new String[N];
        int i = 0;
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if(emailID.contains("@gmail.com")){
                names[i] = firstName;
                i++;
            }
        }
        String[] names2 = new String[i];
        int j;
        for(j=0;j<i;j++)
            names2[j]=names[j];
        Arrays.sort(names2);
        j = 0;
        while(i>0){
            System.out.println(names2[j]);
            j++;
            i--;
        }
        scanner.close();
    }
}
