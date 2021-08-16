package ro.fasttrackit.course12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, find the longest subarray where the absolute difference between any two elements
 * is less than or equal to 1.
 */

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int longest = 1;
        int startIndex = 0;
        int num1 = a.get(0);
        int num2 = -1;
        for (int i = 0; i < a.size(); i++) {
            int n = a.get(i);
            if (num2 == -1) {
                if (Math.abs(num1 - n) == 1) {
                    num2 = n;
                } else if (num1 != n) {
                    longest = Math.max(longest, i - startIndex);
                    startIndex = i;
                    num1 = n;
                }
            } else {
                if (n != num1 && n != num2) {
                    longest = Math.max(longest, i - startIndex);
                    startIndex = i;
                    num1 = n;
                    num2 = -1;
                }
            }
        }
        longest = Math.max(longest, a.size() - startIndex);

        return longest;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
