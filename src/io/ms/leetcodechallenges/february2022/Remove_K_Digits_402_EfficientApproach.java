package io.ms.leetcodechallenges.february2022;

public class Remove_K_Digits_402_EfficientApproach {

    public static void main(String[] args) {
        String digits = "10200";
        int k =1;
        String result = removeKdigits(digits,k);

        System.out.println(result);
    }

    public static String removeKdigits(String num, int leftToRemove) {
        char[] digits = num.toCharArray();
        int stackLength = 0; // "stack" will be located in digits array, starting from 0 index
        for (char currentDigit: digits) {
            // "pop" last digit from "stack" if it's greater than `currentDigit`
            while (leftToRemove > 0 && stackLength > 0 && digits[stackLength - 1] > currentDigit) {
                stackLength--;
                leftToRemove--;
            }
            // "push" `currentDigit` to "stack", but skip leading zeros
            if (stackLength > 0 || currentDigit != '0') {
                digits[stackLength++] = currentDigit;
            }
        }
        // in some cases we may reach the end of the string earlier than finish removing digits
        stackLength -= leftToRemove;
        return stackLength <= 0 ? "0" : String.valueOf(digits, 0, stackLength);
    }
}
