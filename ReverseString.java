/*
Problem: 344. Reverse String
Link: https://leetcode.com/problems/reverse-string/

Description:
Write a function that reverses a string.
The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Examples:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:
1 <= s.length <= 10^5
s[i] is a printable ASCII character.

Approach:
Use two pointers:
- One pointer at the beginning (left)
- One pointer at the end (right)
Swap elements and move pointers towards the center.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}