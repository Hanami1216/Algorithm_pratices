package LeetCode;

import java.util.HashMap;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/4/6  12:28
 */
public class Solution {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.getOrDefault(nums[i], 0) > 0) {
                return true;
            }
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            // 当数组和比后面的数小，滚动数组到后面的数
            pre = Math.max(pre + x, x);
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }
}
