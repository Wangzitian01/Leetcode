package com.example.leetcode.Questions;

/**
 * @Author Smith517
 * @Date 2022/9/9 21:21
 * @Version 1.0
 * @Describe TODO
 */

/**
 * dababad
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "cdaababada";
        System.out.println(dynamicPlan(s));

    }

    public static String longestPalindrome(String str) {
        int len = str.length();
        int begin = 0;
        int maxlen = 1;
        if (len < 2) {
            return str;
        }
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (j - i + 1 > maxlen && validPalindrome(arr, i, j)) {
                    maxlen = j - i + 1;
                    begin = i;
                }
            }
        }
        return str.substring(begin, begin + maxlen);
    }

    public static boolean validPalindrome(char[] array, int left, int right) {
        boolean flag = true;
        while (left < right) {
            if (array[left] != array[right]) {
                flag = false;
            }
            left++;
            right--;
        }
        return flag;
    }


    public static String dynamicPlan(String str) {
        char[] charArray = str.toCharArray();
        int len = str.length();
        if (len < 2) {
            return str;
        }
        int begin = 0;
        int maxlen = 1;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    begin = i;
                }
            }
        }
        return str.substring(begin, begin + maxlen);
    }


}
