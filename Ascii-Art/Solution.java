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
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 0);
        hm.put("B", 1);
        hm.put("C", 2);
        hm.put("D", 3);
        hm.put("E", 4);
        hm.put("F", 5);
        hm.put("G", 6);
        hm.put("H", 7);
        hm.put("I", 8);
        hm.put("J", 9);
        hm.put("K", 10);
        hm.put("L", 11);
        hm.put("M", 12);
        hm.put("N", 13);
        hm.put("O", 14);
        hm.put("P", 15);
        hm.put("Q", 16);
        hm.put("R", 17);
        hm.put("S", 18);
        hm.put("T", 19);
        hm.put("U", 20);
        hm.put("V", 21);
        hm.put("W", 22);
        hm.put("X", 23);
        hm.put("Y", 24);
        hm.put("Z", 25);
        hm.put("?", 26);

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            StringBuilder sb = new StringBuilder();
            String T1 = T.replaceAll("\\s", "?");

            for (int k = 0; k < T1.length(); k++) {
                if (T1.substring(k, k + 1).matches("[$&+,:;=\\\\?@#|/'<>.^*()%!-]")) {
                    for (int j = hm.get("?").intValue() * L; j < (hm.get("?").intValue() * L) + L; j++) {
                        sb.append(ROW.substring(j, j + 1));
                    }
                } else {
                    for (int j = hm.get(T1.substring(k, k + 1).toUpperCase()).intValue()
                            * L; j < (hm.get(T1.substring(k, k + 1).toUpperCase()).intValue() * L) + L; j++) {
                        sb.append(ROW.substring(j, j + 1));
                    }
                }
            }
            System.out.print(sb);
            System.out.println();

        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // System.out.println("answer");
    }
}