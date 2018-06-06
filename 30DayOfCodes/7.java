import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}