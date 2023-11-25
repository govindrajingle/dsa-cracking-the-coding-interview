// One Away: There are three types of edits that can be performed on strings: insert a character, 
// remove a character, or replace a character. Given two strings, write a function to check if they are 
// one edit (or zero edits) away

// EXAMPLE 
// pale , pie - > true 
// pales , pale - > true 
// pale , bale - > true 
// pale , bake - > false 

import java.util.HashMap;

public class One_Five_Problem {

    public static boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false; // If the lengths differ by more than 1, they can't be one edit away.
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count character frequencies in str1
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Update character frequencies based on str2
        for (char ch : str2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        int temp = 0;

        // Count the number of characters with non-zero frequencies
        for (int count : map.values()) {
            temp += count;
        }

        // Check if at most one edit is needed
        return temp <= 1;
    }

    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "bale";
        System.out.println(isOneAway(str1, str2)); // Output: true
    }
}
