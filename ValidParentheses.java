<<<<<<< HEAD
import java.util.Stack;

/*
Problem: Valid Parentheses
Link: https://leetcode.com/problems/valid-parentheses/

Description:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

A string is valid if:
- Open brackets are closed by the same type.
- Open brackets are closed in the correct order.

Examples:
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Approach:
Use a stack to store expected closing brackets.
Push closing bracket when encountering opening one.
When encountering closing bracket, compare with stack top.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
=======
import java.util.Stack;

/*
Problem: Valid Parentheses
Link: https://leetcode.com/problems/valid-parentheses/

Description:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

A string is valid if:
- Open brackets are closed by the same type.
- Open brackets are closed in the correct order.

Examples:
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Approach:
Use a stack to store expected closing brackets.
Push closing bracket when encountering opening one.
When encountering closing bracket, compare with stack top.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
>>>>>>> cd42f6a4d9507de74c0c20b6b0581a35b55cb7d3
}