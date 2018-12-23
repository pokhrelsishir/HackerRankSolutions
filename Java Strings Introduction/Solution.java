import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int total = A.length() + B.length();

        System.out.println(total);

        int num = A.compareTo(B);

        if(num > 0)
        {
            System.out.println("Yes");
        }

        else
        {
            System.out.println("No");
        }

        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.print(A +" " + B);

    }
}



