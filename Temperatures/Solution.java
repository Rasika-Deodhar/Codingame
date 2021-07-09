import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        if (n == 0) {
            System.out.println(0);
        }

        else {
            int t[] = new int[n];
            for (int i = 0; i < n; i++) {
                int val = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                t[i] = val;
            }

            int diff = Integer.MAX_VALUE;
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < t.length; i++) {
                if (Math.abs(t[i]) - 0 < diff && diff > 0) {
                    diff = Math.abs(t[i]) - 0;
                    res = t[i];
                } else if (Math.abs(t[i]) - 0 == diff && t[i] > 0) {
                    res = t[i];
                }
            }

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(res);
        }

    }
}