/*
HT: First Non-Repeating Character ( ** Interview Question)
You have been given a string of lowercase letters.

Write a function called firstNonRepeatingChar(String) that finds the first non-repeating character in the given string using a hash table (HashMap). If there is no non-repeating character in the string, the function should return null.

For example, if the input string is "leetcode", the function should return "l" because "l" is the first character that appears only once in the string. Similarly, if the input string is "hello", the function should return "h" because "h" is the first non-repeating character in the string.

Return type: Character
 */

import java.util.HashMap;

public class FirstNonRepeating {
    public static Character firstNonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

}
