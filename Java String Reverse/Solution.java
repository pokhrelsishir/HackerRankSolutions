import java.io.*;
import java.util.*;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String result = "";

        String A=sc.next();

        for (int i = 0; i < A.length()/2; i++)
        {
            if(A.charAt(i) == (A.charAt(A.length()-1-i)))
            {
                result = "Yes";
            }

            else
            {
                result = "No";
            }

        }

        System.out.print(result);


        /* Enter your code here. Print output to STDOUT. */

    }
}



