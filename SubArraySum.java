/*
HT: Subarray Sum ( ** Interview Question)
Given an array of integers nums and a target integer target, write a method called subarraySum that finds the indices of a contiguous subarray in nums that add up to the target sum using a hash table (HashMap).

Your function should take two arguments:

nums: an array of integers representing the input array

target: an integer representing the target sum


Your function should return a list of two integers representing the starting and ending indices of the subarray that adds up to the target sum. If there is no such subarray, your function should return an empty list.

For example:



int[] nums = [1, 2, 3, 4, 5]
int target = 9
int[] result1 = subarraySum(nums1, target1);

// This should print [1, 3]
System.out.println("[" + result1[0] + ", " + result1[1] + "]");


Note that there may be multiple subarrays that add up to the target sum, but your method only needs to return the indices of any one such subarray. Also, the input array may contain both positive and negative integers.
*/
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (sumIndex.containsKey(currentSum - target)) {
                return new int[]{sumIndex.get(currentSum - target) + 1, i};
            }
            sumIndex.put(currentSum, i);
        }

        return new int[]{};
    }
}
