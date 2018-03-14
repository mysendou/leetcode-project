package com.jeff.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Created by Jeff.Ma on 3/14/2018.
 */
public class LongestSubNRepeatChar {
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> characterSet = new HashSet<Character>();
        int result = 0;
        int i = 0;
        int j = 0;

        while (i < len && j < len){
            if (characterSet.contains(s.charAt(j))) {
                characterSet.remove(s.charAt(i++));
            } else {
                characterSet.add(s.charAt(j++));
                result = Math.max(result, (j - i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "pwke";
        int result = lengthOfLongestSubstring(a);
        System.out.println(result);
    }
}
