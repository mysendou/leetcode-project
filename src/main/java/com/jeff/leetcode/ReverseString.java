package com.jeff.leetcode;

/**
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Given s = "hello", return "olleh".
 *
 * Created by Jeff.Ma on 3/14/2018.
 */
public class ReverseString {
    public static String reverseString(String s) {
        String result = null;
        if(s == null){
            return null;
        }

        result = new StringBuffer(s).reverse().toString();
        return result;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
