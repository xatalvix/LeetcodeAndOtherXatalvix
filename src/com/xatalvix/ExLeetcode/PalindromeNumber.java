package com.xatalvix.ExLeetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int remainder;
        int original = num;
        while (num > 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return original == reversed;
    }
}
