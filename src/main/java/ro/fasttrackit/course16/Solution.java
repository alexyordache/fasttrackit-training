package ro.fasttrackit.course16;


import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set set1 = new HashSet(Arrays.asList(s1.split("")));
        Set set2 = new HashSet(Arrays.asList(s2.split("")));
        Set set3 = new HashSet(set1);
        set3.addAll(set2);
        return set3.size() == set1.size() + set2.size() ? "NO" : "YES";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
