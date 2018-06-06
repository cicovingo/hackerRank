import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actual = sc.nextLine();
        String expected = sc.nextLine();
        if(Integer.parseInt(actual.split(" ")[2])>Integer.parseInt(expected.split(" ")[2]))
            System.out.println(10000);
        else if(Integer.parseInt(actual.split(" ")[2])<Integer.parseInt(expected.split(" ")[2]))
            System.out.println(0);
        else{
                if(Integer.parseInt(actual.split(" ")[1])>Integer.parseInt(expected.split(" ")[1]))
					System.out.println((Integer.parseInt(actual.split(" ")[1])-Integer.parseInt(expected.split(" ")[1]))*500);
				else if(Integer.parseInt(actual.split(" ")[1])<Integer.parseInt(expected.split(" ")[1]))
					System.out.println(0);
				else{
					if(Integer.parseInt(actual.split(" ")[0])>Integer.parseInt(expected.split(" ")[0]))
						System.out.println((Integer.parseInt(actual.split(" ")[0])-Integer.parseInt(expected.split(" ")[0]))*15);
					else
						System.out.println(0);
				}
        }
    }
}