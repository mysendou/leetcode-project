package com.jeff.leetcode;

/**
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Created by Jeff.Ma on 3/14/2018.
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        if (J == null || S == null || "".equals(J) || "".equals(S)){
            return 0;
        }
        char[] chars = J.toCharArray();
        for (int i = 0; i <= chars.length; i++) {

        }

        return result;
    }
}
